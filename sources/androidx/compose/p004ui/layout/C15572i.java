package androidx.compose.p004ui.layout;

import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.layout.i */
public interface C15572i {

    /* renamed from: androidx.compose.ui.layout.i$a */
    public static final class C15573a {
        @Deprecated
        /* renamed from: a */
        public static long m69228a(@C12579k C15572i iVar) {
            return C15572i.super.getOwnerViewId();
        }
    }

    long getLayerId();

    long getOwnerViewId() {
        return 0;
    }
}
