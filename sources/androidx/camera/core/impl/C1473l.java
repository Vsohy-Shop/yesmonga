package androidx.camera.core.impl;

import android.content.Context;
import android.util.Size;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.InitializationException;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.camera.core.impl.l */
public interface C1473l {

    /* renamed from: androidx.camera.core.impl.l$a */
    public interface C1474a {
        @C0359n0
        /* renamed from: a */
        C1473l mo4085a(@C0359n0 Context context, @C0363p0 Object obj, @C0359n0 Set<String> set) throws InitializationException;
    }

    /* renamed from: a */
    SurfaceConfig mo4704a(String str, int i, Size size);

    /* renamed from: b */
    boolean mo4705b(String str, List<SurfaceConfig> list);

    @C0359n0
    /* renamed from: c */
    Map<C1488o1<?>, Size> mo4706c(@C0359n0 String str, @C0359n0 List<SurfaceConfig> list, @C0359n0 List<C1488o1<?>> list2);
}
