package com.usabilla.sdk.ubform.p007db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.p007db.campaign.CampaignTable;
import com.usabilla.sdk.ubform.p007db.form.FormTable;
import com.usabilla.sdk.ubform.p007db.telemetry.TelemetryTable;
import com.usabilla.sdk.ubform.p007db.unsent.UnsentFeedbackTable;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11970i;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.db.DatabaseHelper */
public final class DatabaseHelper extends SQLiteOpenHelper {
    @C12579k

    /* renamed from: b */
    public static final C9772a f26787b = new C9772a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: c */
    public static final String f26788c = "usabilla.db";

    /* renamed from: d */
    public static final int f26789d = 8;
    @C12580l

    /* renamed from: e */
    public static volatile DatabaseHelper f26790e;
    @C12579k

    /* renamed from: a */
    public final List<C9773a> f26791a;

    /* renamed from: com.usabilla.sdk.ubform.db.DatabaseHelper$a */
    public static final class C9772a {
        public /* synthetic */ C9772a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12580l
        /* renamed from: a */
        public final DatabaseHelper mo20006a() {
            return DatabaseHelper.f26790e;
        }

        @C12579k
        /* renamed from: b */
        public final DatabaseHelper mo20007b(@C12579k Context context) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            DatabaseHelper a = mo20006a();
            if (a == null) {
                synchronized (this) {
                    C9772a aVar = DatabaseHelper.f26787b;
                    DatabaseHelper a2 = aVar.mo20006a();
                    if (a2 == null) {
                        Context applicationContext = context.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                        a2 = new DatabaseHelper(applicationContext, (DefaultConstructorMarker) null);
                        aVar.mo20008c(a2);
                    }
                    a = a2;
                }
            }
            return a;
        }

        /* renamed from: c */
        public final void mo20008c(@C12580l DatabaseHelper databaseHelper) {
            DatabaseHelper.f26790e = databaseHelper;
        }

        public C9772a() {
        }
    }

    public /* synthetic */ DatabaseHelper(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public void onCreate(@C12580l SQLiteDatabase sQLiteDatabase) {
        Object unused = C11970i.m47708b((CoroutineContext) null, new DatabaseHelper$onCreate$1(sQLiteDatabase, this, (C11045c<? super DatabaseHelper$onCreate$1>) null), 1, (Object) null);
    }

    public void onDowngrade(@C12580l SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Object unused = C11970i.m47708b((CoroutineContext) null, new DatabaseHelper$onDowngrade$1(sQLiteDatabase, this, (C11045c<? super DatabaseHelper$onDowngrade$1>) null), 1, (Object) null);
    }

    public void onUpgrade(@C12580l SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Object unused = C11970i.m47708b((CoroutineContext) null, new DatabaseHelper$onUpgrade$1(sQLiteDatabase, this, (C11045c<? super DatabaseHelper$onUpgrade$1>) null), 1, (Object) null);
    }

    public DatabaseHelper(Context context) {
        super(context, f26788c, (SQLiteDatabase.CursorFactory) null, 8);
        this.f26791a = CollectionsKt__CollectionsKt.m40448L(new TelemetryTable(), new FormTable(), new CampaignTable(), new UnsentFeedbackTable());
    }
}
