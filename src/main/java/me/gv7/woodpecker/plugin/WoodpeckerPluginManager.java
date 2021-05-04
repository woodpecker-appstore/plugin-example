package me.gv7.woodpecker.plugin;


public class WoodpeckerPluginManager implements IPluginManager{

    public void registerPluginManagerCallbacks(IPluginManagerCallbacks iPluginManagerCallbacks) {
        // 注册漏洞信息
        final VulPluginInfo vulInfo = new VulPluginInfo();
        final InfoPluginInfo infoPlugin = new InfoPluginInfo();

        iPluginManagerCallbacks.registerVulPlugin(vulInfo);
        iPluginManagerCallbacks.registerInfoDetectorPlugin(infoPlugin);

    }
}
