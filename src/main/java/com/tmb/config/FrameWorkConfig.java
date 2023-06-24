package com.tmb.config;


import com.tmb.config.converters.StringToBrowserTypeConverter;
import com.tmb.enums.BrowserType;
import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameWorkConfig extends Config {

    @DefaultValue("chrome")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

}
