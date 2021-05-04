package me.gv7.woodpecker.plugin.pocs;

import me.gv7.woodpecker.plugin.*;

public class Poc implements IPoc {
    @Override
    public IScanResult doVerify(ITarget target, IResultOutput result) throws Throwable {
        // 做漏洞检测用
        String address = target.getAddress();

        // 做出一些漏洞判断之后，向框架反馈漏洞是否存在

        result.successPrintln("发现"+address+"漏洞！");

        IScanResult scanResult = VulPluginInfo.pluginHelper.createScanResult();
        // 设置存在漏洞
        scanResult.setExists(true);

        return scanResult;
    }
}
