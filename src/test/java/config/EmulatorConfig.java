package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "file:src/test/resources/configs/emulator.properties",
})
public interface EmulatorConfig extends Config {
    @Key("platformName")
    String platformName();
    @Key("deviceName")
    String deviceName();
    @Key("app")
    String app();
    @Key("noReset")
    Boolean noReset();
    @Key("newCommandTimeout")
    String newCommandTimeout();
    @Key("connectHardwareKeyboard")
    Boolean connectHardwareKeyboard();
    @Key("remoteUrl")
    String remoteUrl();
}
