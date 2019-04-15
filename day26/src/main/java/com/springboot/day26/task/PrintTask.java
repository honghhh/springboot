package com.springboot.day26.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 测试定时器
 * @author: huangh
 */
@Component
public class PrintTask {

    /**
     * 这是一个时间表达式，可以通过简单的配置就能完成各种时间的配置，我们通过CRON表达式几乎可以完成任意的时间搭配，它包含了六或七个域：
     * Seconds : 可出现", - * /"四个字符，有效范围为0-59的整数
     * Minutes : 可出现", - * /"四个字符，有效范围为0-59的整数
     * Hours : 可出现", - * /"四个字符，有效范围为0-23的整数
     * DayofMonth : 可出现", - * / ? L W C"八个字符，有效范围为0-31的整数
     * Month : 可出现", - * /"四个字符，有效范围为1-12的整数或JAN-DEc
     * DayofWeek : 可出现", - * / ? L C #"四个字符，有效范围为1-7的整数或SUN-SAT两个范围。1表示星期天，2表示星期一， 依次类推
     * Year : 可出现", - * /"四个字符，有效范围为1970-2099年
     *
     * 下面简单举几个例子：
     * "0 0 12 * * ?"    每天中午十二点触发
     * "0 15 10 ? * *"    每天早上10：15触发
     * "0 15 10 * * ?"    每天早上10：15触发
     * "0 15 10 * * ?"    每天早上10：15触发
     * "0 15 10 * * ? 2005"    2005年的每天早上10：15触发
     * "0 * 14 * * ?"    每天从下午2点开始到2点59分每分钟一次触发
     * "0 0/5 14 * * ?"    每天从下午2点开始到2：55分结束每5分钟一次触发
     * "0 0/5 14,18 * * ?"    每天的下午2点至2：55和6点至6点55分两个时间段内每5分钟一次触发
     * "0 0-5 14 * * ?"    每天14:00至14:05每分钟一次触发
     * "0 10,44 14 ? 3 WED"    三月的每周三的14：10和14：44触发
     * "0 15 10 ? * MON-FRI"    每个周一、周二、周三、周四、周五的10：15触发
     */

    /**
     * 每小时的10分执行该方法
     */
    @Scheduled(cron = "0 10 * * * *")
    public void cron() throws Exception {
        System.out.println("执行测试cron时间：" + new Date(System.currentTimeMillis()));
    }

    /**
     * 是上一个调用开始后再次调用的延时(不用等待上一次调用完成)
     */
    @Scheduled(fixedRate = 1000 * 1)
    public void fixedRate() throws Exception {
        Thread.sleep(2000);
        System.out.println("执行测试fixedRate时间：" + new Date(System.currentTimeMillis()));
    }

    /**
     * 上一个调用完成后再次调用的延时调用
     */
    @Scheduled(fixedDelay = 1000 * 1)
    public void fixedDelay() throws Exception {
        Thread.sleep(3000);
        System.out.println("执行测试fixedDelay时间" + new Date(System.currentTimeMillis()));
    }

    /**
     * 第一次被调用前的延时，单位毫秒
     */
    @Scheduled(initialDelay = 1000 * 1, fixedDelay = 1000 * 2)
    public void initialDelay() throws Exception {
        System.out.println("执行测试initialDelay时间" + new Date(System.currentTimeMillis()));
    }

}
