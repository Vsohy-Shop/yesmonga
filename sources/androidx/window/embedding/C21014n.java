package androidx.window.embedding;

import android.annotation.SuppressLint;
import androidx.window.core.C20994d;
import androidx.window.embedding.C21011l;
import androidx.window.extensions.embedding.SplitInfo;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.List;
import java.util.function.Consumer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C20994d
@SuppressLint({"NewApi"})
/* renamed from: androidx.window.embedding.n */
public final class C21014n implements Consumer<List<? extends SplitInfo>> {
    @C12579k

    /* renamed from: a */
    public final C21011l.C21012a f54188a;
    @C12579k

    /* renamed from: b */
    public final C21007i f54189b;

    public C21014n(@C12579k C21011l.C21012a aVar, @C12579k C21007i iVar) {
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
        Intrinsics.checkNotNullParameter(iVar, "adapter");
        this.f54188a = aVar;
        this.f54189b = iVar;
    }

    /* renamed from: a */
    public void accept(@C12579k List<? extends SplitInfo> list) {
        Intrinsics.checkNotNullParameter(list, "splitInfoList");
        this.f54188a.mo62832a(this.f54189b.mo62813i(list));
    }
}
