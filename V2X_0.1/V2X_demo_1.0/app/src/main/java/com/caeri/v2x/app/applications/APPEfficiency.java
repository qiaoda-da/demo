package com.caeri.v2x.app.applications;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * Created by JeRome on 2017/4/28.
 */

public abstract class APPEfficiency extends Application {
    @Override
    public abstract ArrayList<HashMap<String,String>> trigger();
    @Override
    public abstract void setAllParameter(HashMap<String, ArrayList<Object>> pubMap, HashMap<String, ArrayList<Object>> meMap);
}
