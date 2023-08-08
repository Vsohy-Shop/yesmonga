package android.support.p002v4.media;

import android.media.browse.MediaBrowser;
import androidx.annotation.C0376v0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@C0376v0(21)
/* renamed from: android.support.v4.media.g */
public class C0096g {

    /* renamed from: a */
    public static Constructor f252a;

    static {
        try {
            f252a = Class.forName("android.content.pm.ParceledListSlice").getConstructor(new Class[]{List.class});
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static Object m366a(List<MediaBrowser.MediaItem> list) {
        try {
            return f252a.newInstance(new Object[]{list});
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }
}
