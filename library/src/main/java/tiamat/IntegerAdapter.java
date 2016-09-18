package tiamat;

import android.content.SharedPreferences;

final class IntegerAdapter implements Adapter<Integer> {

    static final IntegerAdapter INSTANCE = new IntegerAdapter();

    @Override
    public Integer get(String key, SharedPreferences preferences) {
        return preferences.getInt(key, 0);
    }

    @Override
    public void set(String key, Integer value, SharedPreferences.Editor editor) {
        editor.putInt(key, value);
    }
}
