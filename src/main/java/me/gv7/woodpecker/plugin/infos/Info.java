package me.gv7.woodpecker.plugin.infos;

import me.gv7.woodpecker.plugin.IArgsUsageBinder;
import me.gv7.woodpecker.plugin.IResultOutput;
import me.gv7.woodpecker.plugin.ITarget;
import me.gv7.woodpecker.plugin.InfoDetector;

import java.util.LinkedHashMap;
import java.util.Map;

public class Info implements InfoDetector {
    @Override
    public String getInfoDetectorTabCaption() {
        return null;
    }

    @Override
    public IArgsUsageBinder getInfoDetectorCustomArgs() {
        return null;
    }

    @Override
    public LinkedHashMap<String, String> doDetect(ITarget target, Map<String, Object> customArgs, IResultOutput resultOutput) throws Throwable {
        return null;
    }
}
