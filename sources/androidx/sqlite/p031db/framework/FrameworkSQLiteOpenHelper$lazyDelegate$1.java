package androidx.sqlite.p031db.framework;

import androidx.sqlite.p031db.C20458c;
import androidx.sqlite.p031db.framework.FrameworkSQLiteOpenHelper;
import java.io.File;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;", "a", "()Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;"}, mo22517k = 3, mo22518mv = {1, 7, 1})
/* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$lazyDelegate$1 */
public final class FrameworkSQLiteOpenHelper$lazyDelegate$1 extends Lambda implements C11289a<FrameworkSQLiteOpenHelper.OpenHelper> {
    final /* synthetic */ FrameworkSQLiteOpenHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteOpenHelper$lazyDelegate$1(FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper) {
        super(0);
        this.this$0 = frameworkSQLiteOpenHelper;
    }

    @C12579k
    /* renamed from: a */
    public final FrameworkSQLiteOpenHelper.OpenHelper invoke() {
        FrameworkSQLiteOpenHelper.OpenHelper openHelper;
        if (this.this$0.f52769b == null || !this.this$0.f52771d) {
            openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(this.this$0.f52768a, this.this$0.f52769b, new FrameworkSQLiteOpenHelper.C20472b((FrameworkSQLiteDatabase) null), this.this$0.f52770c, this.this$0.f52772e);
        } else {
            openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(this.this$0.f52768a, new File(C20458c.C20461c.m95356a(this.this$0.f52768a), this.this$0.f52769b).getAbsolutePath(), new FrameworkSQLiteOpenHelper.C20472b((FrameworkSQLiteDatabase) null), this.this$0.f52770c, this.this$0.f52772e);
        }
        C20458c.C20459a.m95353h(openHelper, this.this$0.f52774g);
        return openHelper;
    }
}
