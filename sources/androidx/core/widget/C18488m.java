package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

/* renamed from: androidx.core.widget.m */
public final class C18488m {

    @C0376v0(19)
    /* renamed from: androidx.core.widget.m$a */
    public static class C18489a {
        @C0373u
        /* renamed from: a */
        public static boolean m83687a(ListView listView, int i) {
            return listView.canScrollList(i);
        }

        @C0373u
        /* renamed from: b */
        public static void m83688b(ListView listView, int i) {
            listView.scrollListBy(i);
        }
    }

    /* renamed from: a */
    public static boolean m83685a(@C0359n0 ListView listView, int i) {
        return C18489a.m83687a(listView, i);
    }

    /* renamed from: b */
    public static void m83686b(@C0359n0 ListView listView, int i) {
        C18489a.m83688b(listView, i);
    }
}
