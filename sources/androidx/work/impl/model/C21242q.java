package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.C20305f;
import androidx.room.C20340m0;
import androidx.room.C20351p;
import androidx.room.C20396v;
import androidx.work.C21091d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C20351p(foreignKeys = {@C20396v(childColumns = {"work_spec_id"}, entity = C21249u.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.model.q */
public final class C21242q {
    @C20340m0
    @C20305f(name = "work_spec_id")
    @C12579k

    /* renamed from: a */
    public final String f54791a;
    @C20305f(name = "progress")
    @C12579k

    /* renamed from: b */
    public final C21091d f54792b;

    public C21242q(@C12579k String str, @C12579k C21091d dVar) {
        Intrinsics.checkNotNullParameter(str, "workSpecId");
        Intrinsics.checkNotNullParameter(dVar, "progress");
        this.f54791a = str;
        this.f54792b = dVar;
    }

    @C12579k
    /* renamed from: a */
    public final C21091d mo63446a() {
        return this.f54792b;
    }

    @C12579k
    /* renamed from: b */
    public final String mo63447b() {
        return this.f54791a;
    }
}
