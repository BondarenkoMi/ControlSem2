package ControlWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TvDataBase {
    Map<String, List<TvProgramm>> map = new HashMap<>();
    public TvDataBase(List<String> strings) {
        String currentChanel;
        String currentElem;
        for (int i = 0; i < strings.size(); i++) {
            currentElem = strings.get(i);
            if (currentElem.charAt(0) == '#') {
                currentChanel = currentElem;
                int count = 1;
                List<TvProgramm> list = new ArrayList<>();
                while (i + count < strings.size() && strings.get(i + count).charAt(0) != '#') {
                    TvProgramm tvProgram = new TvProgramm(currentElem, new BroadcastsTime(strings.get(i + count)), strings.get(i + count + 1));
                    list.add(tvProgram);

                    count += 2;
                }
                map.put(currentChanel,list);
            }
        }
    }

    public Map<String, List<TvProgramm>> getMap() {
        return map;
    }
}
