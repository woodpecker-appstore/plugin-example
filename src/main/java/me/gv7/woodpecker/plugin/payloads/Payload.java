package me.gv7.woodpecker.plugin.payloads;

import me.gv7.woodpecker.plugin.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Payload implements IPayloadGenerator {

    // payload 模块的作用是exploit模块打不了，使用payload模块生成payload，然后进行手工利用

    @Override
    public String getPayloadTabCaption() {
        return "payload模块的tab标签名";
    }

    @Override
    public IArgsUsageBinder getPayloadCustomArgs() {
        List<IArg> args = new ArrayList<>();
        final IArg cmd = VulPluginInfo.pluginHelper.createArg();
        cmd.setName("cmd");
        cmd.setDefaultValue("whoami");
        cmd.setDescription("想执行的命令");
        cmd.setRequired(true);
        cmd.setType(IArg.ARG_TYPE_STRING);

        IArgsUsageBinder binder = VulPluginInfo.pluginHelper.createArgsUsageBinder();
        binder.setArgsList(args);
        binder.setUsage("编写参数的使用方法");
        return binder;
    }

    @Override
    public void generatorPayload(Map<String, Object> customArgs, IResultOutput result) throws Throwable {
        String cmd = (String) customArgs.get("cmd");
        result.successPrintln("cmd: "+cmd);
    }
}
