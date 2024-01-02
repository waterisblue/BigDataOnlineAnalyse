

# 大数据在线分析系统

## 简介

解决普通企业拥有大量数据无从分析的问题

通过上传数据到云上分析，一键上传、分析、出图

## 技术栈

- 语言：Java、Scala、TypeScript
- 后端开发：Spring Cloud Alibaba
- 前端开发：Vue3、Electron
- 前端框架：Quasar
- 数据仓库：Hadoop
- 数据分析框架：Spark
- 数据库：MySQL

## 功能特性

- **数据上传与存储：** 用户可以通过前端界面将大数据分批上传，后端将数据传输到Hadoop数据仓库进行存储，并将上传相关信息存储到MySQL数据库。

- **数据分析与可视化：** 数据仓库中的数据通过Spark数据分析框架进行处理，用户可以通过前端调用服务器接口进行简单的数据分析，并得到可视化的图表展示。

- **用户友好界面：** 使用Vue3、TypeScript和Electron构建用户友好、高效的前端界面，提供桌面应用的支持。

## 安装与运行

### 后端

1. 克隆项目代码
   ```bash
   git clone https://gitee.com/waterib/BigDataOnlineAnalyse.git
   cd BigDataOnlineAnalyse

2. 进入后端目录
   ```bash
   cd Backend
   ```

3. 安装依赖
   ```bash
   mvn install
   ```

4. 修改配置文件

   ```bash
   将所有template删除，改为yml文件后修改ip以及端口，部署服务后开启后端
   ```

### 前端

1. 进入前端目录
   ```bash
   cd Fronted
   ```

2. 安装依赖
   ```bash
   npm install
   ```

3. 启动前端应用
   ```bash
   npm run dev
   ```

## 开发与贡献

项目一人开发，暂无发行版，正在开发ing

如有想一同开发者，直接创建分支即可~~

## 目前进度

正在完善前端简单功能框架