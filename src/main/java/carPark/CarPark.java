package carPark;

import lombok.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @program: LeetCode
 * @description:
 * @author: CentreS
 * @create: 2020-08-28 14:56:56
 **/
public class CarPark implements Runnable {
    /**
     * 停车场:(停车场层数，（车位号，停放信息）)
     */
    static Map<Integer, Map<Integer, ParkRecord>> park = new HashMap<Integer, Map<Integer, ParkRecord>>();

    static Integer count = 300;

    /**
     * 初始化停车场信息
     */
    CarPark() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 100; j++) {
                Map<Integer, ParkRecord> tempMap = new HashMap();
                tempMap.put(j, null);
                park.put(i, tempMap);
            }
        }
    }

    /**
     * 获取当前时间
     *
     * @return
     */
    public static String getCurrentTime() {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return ft.format(date);
    }

    /**
     * 获取时间差
     *
     * @param startTime
     * @param endTime
     * @return
     */

    public static String getDatePoor(String startTime, String endTime) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startDate = null;
        Date endDate = null;
        try {
            startDate = ft.parse(startTime);
            endDate = ft.parse(endTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long nd = 1000 * 24 * 60 * 60;
        long nh = 1000 * 60 * 60;
        long nm = 1000 * 60;
        // long ns = 1000;
        // 获得两个时间的毫秒时间差异
        long diff = endDate.getTime() - startDate.getTime();
        // 计算差多少天
        long day = diff / nd;
        // 计算差多少小时
        long hour = diff % nd / nh;
        // 计算差多少分钟
        long min = diff % nd % nh / nm;
        // 计算差多少秒//输出结果
        // long sec = diff % nd % nh % nm / ns;
        return hour + "小时" + min + "分钟";
    }

    /**
     * @param floor 层数
     * @param num   车位号
     * @param code  车牌号
     */
    void in(Integer floor, Integer num, String code) {
        // 初始化停车信息
        ParkRecord parkRecord = new ParkRecord();
        parkRecord.setCode(code);
        parkRecord.setStartTime(getCurrentTime());
        // 录入停车信息
        park.get(floor).put(num, parkRecord);
    }

    OutInfo out(Integer floor, Integer num) {
        ParkRecord parkRecord = park.get(floor).get(num);
        if (parkRecord == null) {
            // 查无此车
            return null;
        }
        OutInfo outInfo = new OutInfo();
        outInfo.setCode(parkRecord.getCode());
        outInfo.setTimes(getDatePoor(parkRecord.getStartTime(), getCurrentTime()));
        return outInfo;
    }

    void print() {
        for (Map.Entry<Integer, Map<Integer, ParkRecord>> integerMapEntry : park.entrySet()) {
            Integer key = integerMapEntry.getKey();
            Map<Integer, ParkRecord> value = integerMapEntry.getValue();
            System.out.print("[");
            for (Map.Entry<Integer, ParkRecord> integerParkRecordEntry : value.entrySet()) {
                System.out.print("floor: " + (key + 1) + ",");
                System.out.print("num" + integerParkRecordEntry.getKey() + ",");
                System.out.print("code" + integerMapEntry.getValue() + ",");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            if (scanner.next().equals("exit")) {
                Integer floor = scanner.nextInt();
                Integer num = scanner.nextInt();
                String code = scanner.next();
                OutInfo out = out(floor, num);
                System.out.println(out.toString());
            }
            if (scanner.next().equals("in")) {
                Integer floor = scanner.nextInt();
                Integer num = scanner.nextInt();
                String code = scanner.next();
                in(floor, num, code);
                print();
            }

        }
    }

}

@Data
class ParkRecord {
    // 车牌
    private String code;
    // 起始时间
    private String startTime;

}

@Data
class OutInfo {
    // 车牌
    private String code;
    // 停车时间长
    private String times;

}

