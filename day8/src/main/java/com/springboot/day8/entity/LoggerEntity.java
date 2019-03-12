package com.springboot.day8.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @description: 日志类
 * @author: huangh
 * @createDate: 2019/3/11 18:08
 */
@Entity
@Table(name = "t_logger_infos")
public class LoggerEntity implements Serializable {

    // 编号
    @Id
    @GeneratedValue
    @Column(name = "ali_id")
    private Long id;

    // 客户端请求ip
    @Column(name = "ali_client_ip")
    private String clientIp;

    // 客户端请求路径
    @Column(name = "ali_uri")
    private String uri;

    // 终端请求方式,普通请求,ajax请求
    @Column(name = "ali_type")
    private String type;

    // 请求方式method,post,get等
    @Column(name = "ali_method")
    private String method;

    // 请求参数内容,json
    @Column(name = "ali_param_data")
    private String paramData;

    // 请求接口唯一session标识
    @Column(name = "ali_session_id")
    private String sessionId;

    // 请求时间
    @Column(name = "ali_time", insertable = false)
    private Timestamp time;

    // 接口返回时间
    @Column(name = "ali_returm_time")
    private String returnTime;

    // 接口返回数据json
    @Column(name = "ali_return_data")
    private String returnData;

    // 请求时httpStatusCode代码，如：200,400,404等
    @Column(name = "ali_http_status_code")
    private String httpStatusCode;

    // 请求耗时秒单位
    @Column(name = "ali_time_consuming")
    private int timeConsuming;

    /**
     * Gets the value of id.
     *
     * @return the value of id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * <p>You can use getId() to get the value of id</p>
     *
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the value of clientIp.
     *
     * @return the value of clientIp
     */
    public String getClientIp() {
        return clientIp;
    }

    /**
     * Sets the clientIp.
     *
     * <p>You can use getClientIp() to get the value of clientIp</p>
     *
     * @param clientIp clientIp
     */
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    /**
     * Gets the value of uri.
     *
     * @return the value of uri
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the uri.
     *
     * <p>You can use getUri() to get the value of uri</p>
     *
     * @param uri uri
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * Gets the value of type.
     *
     * @return the value of type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     *
     * <p>You can use getType() to get the value of type</p>
     *
     * @param type type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the value of method.
     *
     * @return the value of method
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets the method.
     *
     * <p>You can use getMethod() to get the value of method</p>
     *
     * @param method method
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * Gets the value of paramData.
     *
     * @return the value of paramData
     */
    public String getParamData() {
        return paramData;
    }

    /**
     * Sets the paramData.
     *
     * <p>You can use getParamData() to get the value of paramData</p>
     *
     * @param paramData paramData
     */
    public void setParamData(String paramData) {
        this.paramData = paramData;
    }

    /**
     * Gets the value of sessionId.
     *
     * @return the value of sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the sessionId.
     *
     * <p>You can use getSessionId() to get the value of sessionId</p>
     *
     * @param sessionId sessionId
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * Gets the value of time.
     *
     * @return the value of time
     */
    public Timestamp getTime() {
        return time;
    }

    /**
     * Sets the time.
     *
     * <p>You can use getTime() to get the value of time</p>
     *
     * @param time time
     */
    public void setTime(Timestamp time) {
        this.time = time;
    }

    /**
     * Gets the value of returnTime.
     *
     * @return the value of returnTime
     */
    public String getReturnTime() {
        return returnTime;
    }

    /**
     * Sets the returnTime.
     *
     * <p>You can use getReturnTime() to get the value of returnTime</p>
     *
     * @param returnTime returnTime
     */
    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    /**
     * Gets the value of returnData.
     *
     * @return the value of returnData
     */
    public String getReturnData() {
        return returnData;
    }

    /**
     * Sets the returnData.
     *
     * <p>You can use getReturnData() to get the value of returnData</p>
     *
     * @param returnData returnData
     */
    public void setReturnData(String returnData) {
        this.returnData = returnData;
    }

    /**
     * Gets the value of httpStatusCode.
     *
     * @return the value of httpStatusCode
     */
    public String getHttpStatusCode() {
        return httpStatusCode;
    }

    /**
     * Sets the httpStatusCode.
     *
     * <p>You can use getHttpStatusCode() to get the value of httpStatusCode</p>
     *
     * @param httpStatusCode httpStatusCode
     */
    public void setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    /**
     * Gets the value of timeConsuming.
     *
     * @return the value of timeConsuming
     */
    public int getTimeConsuming() {
        return timeConsuming;
    }

    /**
     * Sets the timeConsuming.
     *
     * <p>You can use getTimeConsuming() to get the value of timeConsuming</p>
     *
     * @param timeConsuming timeConsuming
     */
    public void setTimeConsuming(int timeConsuming) {
        this.timeConsuming = timeConsuming;
    }
}
