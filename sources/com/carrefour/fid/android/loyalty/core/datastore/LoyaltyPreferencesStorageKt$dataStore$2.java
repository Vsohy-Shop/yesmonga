package com.carrefour.fid.android.loyalty.core.datastore;

import android.content.Context;
import androidx.datastore.core.C18569c;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.core.C18602a;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.collections.C10976s;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"Landroid/content/Context;", "context", "", "Landroidx/datastore/core/c;", "Landroidx/datastore/preferences/core/a;", "invoke", "(Landroid/content/Context;)Ljava/util/List;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class LoyaltyPreferencesStorageKt$dataStore$2 extends Lambda implements C11300l<Context, List<? extends C18569c<C18602a>>> {
    public static final LoyaltyPreferencesStorageKt$dataStore$2 INSTANCE = new LoyaltyPreferencesStorageKt$dataStore$2();

    public LoyaltyPreferencesStorageKt$dataStore$2() {
        super(1);
    }

    @C12579k
    public final List<C18569c<C18602a>> invoke(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        return C10976s.m41419k(new SharedPreferencesMigration(context, "Loyalty", (Set) null, (C11304p) null, LoyaltyPreferencesStorageKt.loyaltyMigration(), 12, (DefaultConstructorMarker) null));
    }
}
