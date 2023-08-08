package androidx.window.embedding;

import android.app.Activity;
import androidx.appcompat.widget.C0696c;
import androidx.window.core.C20994d;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C20994d
/* renamed from: androidx.window.embedding.t */
public final class C21024t {
    @C12579k

    /* renamed from: a */
    public final C21001c f54215a;
    @C12579k

    /* renamed from: b */
    public final C21001c f54216b;

    /* renamed from: c */
    public final float f54217c;

    public C21024t(@C12579k C21001c cVar, @C12579k C21001c cVar2, float f) {
        Intrinsics.checkNotNullParameter(cVar, "primaryActivityStack");
        Intrinsics.checkNotNullParameter(cVar2, "secondaryActivityStack");
        this.f54215a = cVar;
        this.f54216b = cVar2;
        this.f54217c = f;
    }

    /* renamed from: a */
    public final boolean mo62861a(@C12579k Activity activity) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        if (this.f54215a.mo62799a(activity) || this.f54216b.mo62799a(activity)) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: b */
    public final C21001c mo62862b() {
        return this.f54215a;
    }

    @C12579k
    /* renamed from: c */
    public final C21001c mo62863c() {
        return this.f54216b;
    }

    /* renamed from: d */
    public final float mo62864d() {
        return this.f54217c;
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21024t)) {
            return false;
        }
        C21024t tVar = (C21024t) obj;
        if (!Intrinsics.areEqual((Object) this.f54215a, (Object) tVar.f54215a) || !Intrinsics.areEqual((Object) this.f54216b, (Object) tVar.f54216b)) {
            return false;
        }
        if (this.f54217c == tVar.f54217c) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.f54215a.hashCode() * 31) + this.f54216b.hashCode()) * 31) + Float.hashCode(this.f54217c);
    }

    @C12579k
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SplitInfo:{");
        sb.append("primaryActivityStack=" + mo62862b() + ',');
        sb.append("secondaryActivityStack=" + mo62863c() + ',');
        sb.append("splitRatio=" + mo62864d() + C12361b.f30259j);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
