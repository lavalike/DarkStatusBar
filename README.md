# dark-status-bar
> 更改状态栏内文字和图标亮暗状态

### 依赖导入

``` gradle
implementation 'com.wangzhen:dark-status-bar:1.0.0'
```

### 接口说明

``` java
public interface StatusBar {
    void fitDark(Context ctx);
    void fitLight(Context ctx);
}
```

#### 代码示例

变暗

``` java
DarkStatusBar.get().fitDark(Context)
```

变亮

``` java
DarkStatusBar.get().fitLight(Context)
```
