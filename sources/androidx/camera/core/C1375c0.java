package androidx.camera.core;

import androidx.annotation.C0359n0;
import androidx.camera.core.impl.C1430a0;
import androidx.camera.core.impl.C1581x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.camera.core.c0 */
public final class C1375c0 {

    /* renamed from: androidx.camera.core.c0$a */
    public static final class C1376a implements C1581x {

        /* renamed from: a */
        public final List<C1430a0> f4005a;

        public C1376a(List<C1430a0> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.f4005a = Collections.unmodifiableList(new ArrayList(list));
        }

        /* renamed from: a */
        public List<C1430a0> mo5074a() {
            return this.f4005a;
        }
    }

    @C0359n0
    /* renamed from: a */
    public static C1581x m5853a(@C0359n0 List<C1430a0> list) {
        return new C1376a(list);
    }

    @C0359n0
    /* renamed from: b */
    public static C1581x m5854b(@C0359n0 C1430a0... a0VarArr) {
        return new C1376a(Arrays.asList(a0VarArr));
    }

    @C0359n0
    /* renamed from: c */
    public static C1581x m5855c() {
        return m5854b(new C1430a0.C1431a());
    }
}
