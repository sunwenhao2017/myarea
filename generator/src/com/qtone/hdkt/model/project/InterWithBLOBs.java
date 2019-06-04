package com.qtone.hdkt.model.project;

import java.io.Serializable;

public class InterWithBLOBs extends Inter implements Serializable {
    /**
     * 请求参数
     */
    private String reqParam;

    /**
     * 请求参数
     */
    private String reqParamDesc;

    /**
     * 响应结果
     */
    private String repResult;

    /**
     * 响应结果说明
     */
    private String repResultDesc;

    private static final long serialVersionUID = 1L;

    public String getReqParam() {
        return reqParam;
    }

    public void setReqParam(String reqParam) {
        this.reqParam = reqParam == null ? null : reqParam.trim();
    }

    public String getReqParamDesc() {
        return reqParamDesc;
    }

    public void setReqParamDesc(String reqParamDesc) {
        this.reqParamDesc = reqParamDesc == null ? null : reqParamDesc.trim();
    }

    public String getRepResult() {
        return repResult;
    }

    public void setRepResult(String repResult) {
        this.repResult = repResult == null ? null : repResult.trim();
    }

    public String getRepResultDesc() {
        return repResultDesc;
    }

    public void setRepResultDesc(String repResultDesc) {
        this.repResultDesc = repResultDesc == null ? null : repResultDesc.trim();
    }
}