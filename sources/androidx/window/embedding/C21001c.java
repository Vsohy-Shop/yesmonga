package androidx.window.embedding;

import android.app.Activity;
import androidx.appcompat.widget.C0696c;
import androidx.window.core.C20994d;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C20994d
/* renamed from: androidx.window.embedding.c */
public final class C21001c {
    @C12579k

    /* renamed from: a */
    public final List<Activity> f54174a;

    /* renamed from: b */
    public final boolean f54175b;

    public C21001c(@C12579k List<? extends Activity> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "activities");
        this.f54174a = list;
        this.f54175b = z;
    }

    /* renamed from: a */
    public final boolean mo62799a(@C12579k Activity activity) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        return this.f54174a.contains(activity);
    }

    @C12579k
    /* renamed from: b */
    public final List<Activity> mo62800b() {
        return this.f54174a;
    }

    /* renamed from: c */
    public final boolean mo62801c() {
        return this.f54175b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21001c)) {
            return false;
        }
        C21001c cVar = (C21001c) obj;
        if (Intrinsics.areEqual((Object) this.f54174a, (Object) cVar.f54174a) || this.f54175b == cVar.f54175b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f54175b ? 1 : 0) * true) + this.f54174a.hashCode();
    }

    @C12579k
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActivityStack{");
        sb.append(Intrinsics.stringPlus("activities=", mo62800b()));
        sb.append("isEmpty=" + this.f54175b + C12361b.f30259j);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21001c(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? false : z);
    }
}
