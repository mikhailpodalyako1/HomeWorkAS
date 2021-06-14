package com.gmail.calculator2;

import android.content.Context;
import android.content.SharedPreferences;
import static android.content.Context.MODE_PRIVATE;

public class ThemeStorge {
    private static final String KEY_APP_THEME = "KEY_APP_THEME";



    private final SharedPreferences sharedPreferences;

    public ThemeStorge(Context context) {


        sharedPreferences = context.getSharedPreferences("app_theme", MODE_PRIVATE );
    }
    public Theme getTheme (){
        String key = sharedPreferences.getString(KEY_APP_THEME, Theme.DEFAULT.getKey());
        for (Theme theme:Theme.values()){
            if (theme.getKey().equals(key)){
                return theme;
            }
        }
        throw new IllegalStateException("Wrong");
    }
    public void setTheme(Theme theme){
        sharedPreferences.edit()
                .putString(KEY_APP_THEME, theme.getKey())
                .apply();

    }
}
