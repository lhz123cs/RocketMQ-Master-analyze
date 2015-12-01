/**
 * Copyright (C) 2010-2013 Alibaba Group Holding Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.rocketmq.client.hook;

import java.util.List;

import com.alibaba.rocketmq.common.message.MessageExt;
import com.alibaba.rocketmq.common.message.MessageQueue;


/**
 * @author manhong.yqd<jodie.yqd@gmail.com>
 * @since 2014-3-19
 */
public class FilterMessageContext {
    private String consumerGroup;
    private List<MessageExt> msgList;
    private MessageQueue mq;
    private Object arg;
    private boolean unitMode;


    public String getConsumerGroup() {
        return consumerGroup;
    }


    public void setConsumerGroup(String consumerGroup) {
        this.consumerGroup = consumerGroup;
    }


    public List<MessageExt> getMsgList() {
        return msgList;
    }


    public void setMsgList(List<MessageExt> msgList) {
        this.msgList = msgList;
    }


    public MessageQueue getMq() {
        return mq;
    }


    public void setMq(MessageQueue mq) {
        this.mq = mq;
    }


    public Object getArg() {
        return arg;
    }


    public void setArg(Object arg) {
        this.arg = arg;
    }


    public boolean isUnitMode() {
        return unitMode;
    }


    public void setUnitMode(boolean isUnitMode) {
        this.unitMode = isUnitMode;
    }


    @Override
    public String toString() {
        return "ConsumeMessageContext [consumerGroup=" + consumerGroup + ", msgList=" + msgList + ", mq=" + mq
                + ", arg=" + arg + "]";
    }
}