package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C12064m2;
import kotlinx.coroutines.internal.C12027x;
import kotlinx.coroutines.internal.C12033z;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.android.a */
public final class C11708a implements C12033z {
    @C12579k
    /* renamed from: a */
    public String mo23715a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @C12579k
    /* renamed from: b */
    public C12064m2 mo23716b(@C12579k List<? extends C12033z> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new HandlerContext(C11713f.m46116e(mainLooper, true), (String) null, 2, (DefaultConstructorMarker) null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    /* renamed from: c */
    public int mo23717c() {
        return C12027x.f29642j;
    }
}
