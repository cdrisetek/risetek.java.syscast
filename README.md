# Risetek SYSCAST SERVER DEMO

## 执行方式
* ```mvn exec:java```
* 或者在target目录下：```java -jar risetek.syscast-1.0-SNAPSHOT.jar```

## 输出结果
* 示例程序在局域网络上接收设备发出的UDP广播信号，将接收到的报文转变成字符串在控制台上输出。
* ```<?xml version="1.0" encoding="UTF-8"?><Risetek><modem channel="0" connected="1" ident="460018012757876" signal="18" /></Risetek>```

## 格式说明
* channel是表明模块所在的通道号码，单通道设备为0
* connected表明使用该模块的接口（Dialer）是否与LNS服务端连接好
* ident是从该模块所使用的(U)SIM卡上获取的IMEI号码，是唯一的号码
* signal表明信号强度，一般从1-31，99表明未能分辨出信号

## 可执行文件下载：
 http://www.risetek.com/download/syscast.jar
