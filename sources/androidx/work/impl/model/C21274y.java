package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.C20305f;
import androidx.room.C20351p;
import androidx.room.C20396v;
import androidx.room.Index;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C20351p(foreignKeys = {@C20396v(childColumns = {"work_spec_id"}, entity = C21249u.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@Index({"work_spec_id"})}, primaryKeys = {"tag", "work_spec_id"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.model.y */
public final class C21274y {
    @C20305f(name = "tag")
    @C12579k

    /* renamed from: a */
    public final String f54870a;
    @C20305f(name = "work_spec_id")
    @C12579k

    /* renamed from: b */
    public final String f54871b;

    public C21274y(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(str2, "workSpecId");
        this.f54870a = str;
        this.f54871b = str2;
    }

    @C12579k
    /* renamed from: a */
    public final String mo63573a() {
        return this.f54870a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo63574b() {
        return this.f54871b;
    }
}
