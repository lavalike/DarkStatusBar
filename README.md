# DarkStatusBar
> 更改状态栏内文字和图标亮暗状态

#### 添加依赖

项目工程build.gradle添加依赖
``` gradle
implementation 'com.wangzhen:dark-status-bar:1.0.0'
```

#### 使用方法

变暗
``` java
DarkStatusBar.get().fitDark(Context)
```

变亮
``` java
DarkStatusBar.get().fitLight(Context)
```
