package com.carrefour.fid.android.presentation.models.extension;

import android.content.Context;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.constants.C36187r;
import com.carrefour.fid.android.domain.models.slot.Slot;
import com.carrefour.fid.android.shared.util.C28932h;
import com.carrefour.fid.android.shared.util.C28935i;
import com.urbanairship.iam.events.C9175a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.joda.time.DateTime;

/* renamed from: com.carrefour.fid.android.presentation.models.extension.p */
public final class C38481p {
    /* renamed from: a */
    public static final boolean m159658a(@C12579k Slot slot) {
        Intrinsics.checkNotNullParameter(slot, "<this>");
        if (!Intrinsics.areEqual((Object) slot.mo119510u(), (Object) C36187r.f89350a) || !Intrinsics.areEqual((Object) slot.mo119514x(), (Object) Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    @C12579k
    /* renamed from: b */
    public static final String m159659b(@C12579k Slot slot, @C12579k Context context) {
        String str;
        Intrinsics.checkNotNullParameter(slot, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        try {
            Date O0 = DateTime.m51195N2(slot.mo119504p()).mo28744O0();
            str = context.getString(R.string.order_withdrawal_date, new Object[]{new SimpleDateFormat("HH:mm", Locale.FRANCE).format(O0), new SimpleDateFormat("EEEE dd MMMM", Locale.FRANCE).format(O0)});
        } catch (Exception unused) {
            str = new String();
        }
        Intrinsics.checkNotNullExpressionValue(str, "try {\n    val start = Da…ception) {\n    String()\n}");
        return str;
    }

    @C12580l
    /* renamed from: c */
    public static final Date m159660c(@C12579k Slot slot) {
        Intrinsics.checkNotNullParameter(slot, "<this>");
        try {
            return DateTime.m51195N2(slot.mo119504p()).mo28744O0();
        } catch (Exception e) {
            C28935i iVar = C28935i.f70940a;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            C28935i.m119705e(iVar, message, (Throwable) null, 0, 6, (Object) null);
            return null;
        }
    }

    @C12579k
    /* renamed from: d */
    public static final String m159661d(@C12579k Slot slot, @C12579k Context context) {
        String str;
        Intrinsics.checkNotNullParameter(slot, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        try {
            Date O0 = DateTime.m51195N2(slot.mo119504p()).mo28744O0();
            str = context.getString(R.string.slot_date_time, new Object[]{new SimpleDateFormat(C28932h.f70939z, Locale.FRANCE).format(O0), new SimpleDateFormat("HH'h'mm", Locale.FRANCE).format(O0), new SimpleDateFormat("HH'h'mm", Locale.FRANCE).format(DateTime.m51195N2(slot.mo119505q()).mo28744O0())});
        } catch (Exception unused) {
            str = new String();
        }
        Intrinsics.checkNotNullExpressionValue(str, "try {\n    val start = Da…ception) {\n    String()\n}");
        return str;
    }

    @C12579k
    /* renamed from: e */
    public static final String m159662e(@C12579k Slot slot) {
        Intrinsics.checkNotNullParameter(slot, "<this>");
        try {
            Date O0 = DateTime.m51195N2(slot.mo119504p()).mo28744O0();
            Date O02 = DateTime.m51195N2(slot.mo119505q()).mo28744O0();
            String str = new SimpleDateFormat("HH'h'mm", Locale.FRANCE).format(O0) + " - " + new SimpleDateFormat("HH'h'mm", Locale.FRANCE).format(O02);
            Intrinsics.checkNotNullExpressionValue(str, "{\n        val start = Da…eBuilder.toString()\n    }");
            return str;
        } catch (Exception unused) {
            return new String();
        }
    }
}
