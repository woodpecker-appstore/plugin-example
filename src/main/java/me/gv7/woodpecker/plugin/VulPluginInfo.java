package me.gv7.woodpecker.plugin;

import me.gv7.woodpecker.plugin.exploits.Exploit;
import me.gv7.woodpecker.plugin.infos.Info;
import me.gv7.woodpecker.plugin.payloads.Payload;
import me.gv7.woodpecker.plugin.pocs.Poc;

import java.util.ArrayList;
import java.util.List;

public class VulPluginInfo implements IVulPlugin {

    public static IVulPluginCallbacks callbacks;
    public static IPluginHelper pluginHelper;

    @Override
    public void VulPluginMain(IVulPluginCallbacks callbacks) {
        // 填写漏洞模块的信息

        callbacks.setVulPluginName("漏洞模块范例");
        callbacks.setVulPluginAuthor("Ppsoft1991");
        callbacks.setVulId("cve-2021-xxxx");
        callbacks.setVulDescription("漏洞的描述");
        // CVSS评分
        callbacks.setVulCVSS(9.0);

        // 漏洞类型
        callbacks.setVulSeverity(callbacks.VUL_CATEGORY_RCE);

        // 漏洞所属于的厂商
        callbacks.setVulProduct("websphere");

        // 漏洞的版本描述
        callbacks.setVulDescription("websphere<7.0");

        // 这里开始注册Exploit模块，Exploit模块的作用为对漏洞发起攻击
        List<IExploit> exploitList = new ArrayList<>();
        exploitList.add(new Exploit());
        callbacks.registerExploit(exploitList);

        // 注册Poc 做漏洞检测用
        callbacks.registerPoc(new Poc());

        // 注册Payload 模块的作用是exploit模块打不了，使用payload模块生成payload，然后进行手工利用
        List<IPayloadGenerator> payloads = new ArrayList<>();
        payloads.add(new Payload());
        callbacks.registerPayloadGenerator(payloads);



    }
}
