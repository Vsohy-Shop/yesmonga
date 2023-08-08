package com.carrefour.fid.android.core.extension;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import androidx.core.content.C17318d;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.constants.OrderStatus;
import com.carrefour.fid.android.design.components.widgets.OrderStatusComponent;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsHeaderModel;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.core.extension.e */
public final class C36306e {
    @C12579k

    /* renamed from: a */
    public static final String f89637a = " (";

    @C12579k
    /* renamed from: a */
    public static final SpannableString m148949a(@C12579k OrderStatus orderStatus, @C12579k Context context) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Intrinsics.checkNotNullParameter(orderStatus, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        SpannableString spannableString = new SpannableString(m148955g(orderStatus, context));
        if (Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Cancelled.f89252e)) {
            i = R.color.color_red;
        } else {
            boolean z9 = true;
            if (Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Validated.f89268e)) {
                z = true;
            } else {
                z = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Affected.f89246e);
            }
            if (z) {
                z2 = true;
            } else {
                z2 = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.AwaitingPreparation.f89250e);
            }
            if (z2) {
                z3 = true;
            } else {
                z3 = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.PreparationInProgress.f89258e);
            }
            if (z3) {
                z4 = true;
            } else {
                z4 = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Prepared.f89260e);
            }
            if (z4) {
                z5 = true;
            } else {
                z5 = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.ReadyToPick.f89262e);
            }
            if (z5) {
                z6 = true;
            } else {
                z6 = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Shipped.f89264e);
            }
            if (z6) {
                z7 = true;
            } else {
                z7 = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Delivered.f89256e);
            }
            if (z7) {
                z8 = true;
            } else {
                z8 = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Arrived.f89248e);
            }
            if (!z8) {
                z9 = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Closed.f89254e);
            }
            if (z9) {
                i = R.color.ds_green;
            } else {
                i = R.color.light_black;
            }
        }
        spannableString.setSpan(new ForegroundColorSpan(C17318d.m79723f(context, i)), 0, spannableString.length(), 34);
        return spannableString;
    }

    @C12579k
    /* renamed from: b */
    public static final SpannableString m148950b(@C12579k OrdersOnlineDetailsHeaderModel ordersOnlineDetailsHeaderModel, @C12579k Context context) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Intrinsics.checkNotNullParameter(ordersOnlineDetailsHeaderModel, "item");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        SpannableString spannableString = new SpannableString(m148951c(ordersOnlineDetailsHeaderModel, context));
        if (StringsKt__StringsKt.contains$default((CharSequence) spannableString, (CharSequence) f89637a, false, 2, (Object) null)) {
            i = StringsKt__StringsKt.indexOf$default((CharSequence) spannableString, f89637a, 0, false, 6, (Object) null);
        } else {
            i = spannableString.length();
        }
        OrderStatus g = ordersOnlineDetailsHeaderModel.mo73380g();
        if (Intrinsics.areEqual((Object) g, (Object) OrderStatus.Cancelled.f89252e)) {
            i2 = R.color.color_red;
        } else {
            boolean z9 = true;
            if (Intrinsics.areEqual((Object) g, (Object) OrderStatus.Validated.f89268e)) {
                z = true;
            } else {
                z = Intrinsics.areEqual((Object) g, (Object) OrderStatus.Affected.f89246e);
            }
            if (z) {
                z2 = true;
            } else {
                z2 = Intrinsics.areEqual((Object) g, (Object) OrderStatus.AwaitingPreparation.f89250e);
            }
            if (z2) {
                z3 = true;
            } else {
                z3 = Intrinsics.areEqual((Object) g, (Object) OrderStatus.PreparationInProgress.f89258e);
            }
            if (z3) {
                z4 = true;
            } else {
                z4 = Intrinsics.areEqual((Object) g, (Object) OrderStatus.Prepared.f89260e);
            }
            if (z4) {
                z5 = true;
            } else {
                z5 = Intrinsics.areEqual((Object) g, (Object) OrderStatus.ReadyToPick.f89262e);
            }
            if (z5) {
                z6 = true;
            } else {
                z6 = Intrinsics.areEqual((Object) g, (Object) OrderStatus.Arrived.f89248e);
            }
            if (z6) {
                z7 = true;
            } else {
                z7 = Intrinsics.areEqual((Object) g, (Object) OrderStatus.Shipped.f89264e);
            }
            if (z7) {
                z8 = true;
            } else {
                z8 = Intrinsics.areEqual((Object) g, (Object) OrderStatus.Delivered.f89256e);
            }
            if (!z8) {
                z9 = Intrinsics.areEqual((Object) g, (Object) OrderStatus.Closed.f89254e);
            }
            if (z9) {
                i2 = R.color.ds_green;
            } else {
                i2 = R.color.light_black;
            }
        }
        spannableString.setSpan(new ForegroundColorSpan(C17318d.m79723f(context, i2)), 0, i, 18);
        spannableString.setSpan(new RelativeSizeSpan(0.8f), i, spannableString.length(), 18);
        return spannableString;
    }

    @C12579k
    /* renamed from: c */
    public static final String m148951c(@C12579k OrdersOnlineDetailsHeaderModel ordersOnlineDetailsHeaderModel, @C12579k Context context) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        boolean z4;
        boolean z5;
        Intrinsics.checkNotNullParameter(ordersOnlineDetailsHeaderModel, "item");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        OrderStatus g = ordersOnlineDetailsHeaderModel.mo73380g();
        boolean z6 = true;
        if (Intrinsics.areEqual((Object) g, (Object) OrderStatus.Closed.f89254e)) {
            z = true;
        } else {
            z = Intrinsics.areEqual((Object) g, (Object) OrderStatus.Delivered.f89256e);
        }
        if (z) {
            z2 = true;
        } else {
            z2 = Intrinsics.areEqual((Object) g, (Object) OrderStatus.ReadyToPick.f89262e);
        }
        if (!z2) {
            return m148956h(ordersOnlineDetailsHeaderModel.mo73380g(), context);
        }
        OrderType f = ordersOnlineDetailsHeaderModel.mo73378f();
        if (Intrinsics.areEqual((Object) f, (Object) OrderType.Drive.f70282e)) {
            z3 = true;
        } else {
            z3 = Intrinsics.areEqual((Object) f, (Object) OrderType.DriveExpressPickup.f70284e);
        }
        if (z3) {
            if (ordersOnlineDetailsHeaderModel.mo73360T().length() != 0) {
                z6 = false;
            }
            if (z6) {
                str = context.getString(R.string.order_txt_order_status_retiree);
            } else {
                str = m148956h(ordersOnlineDetailsHeaderModel.mo73380g(), context);
            }
        } else {
            if (Intrinsics.areEqual((Object) f, (Object) OrderType.Clcv.f70280e)) {
                z4 = true;
            } else {
                z4 = Intrinsics.areEqual((Object) f, (Object) OrderType.H1h3.f70286e);
            }
            if (z4) {
                z5 = true;
            } else {
                z5 = Intrinsics.areEqual((Object) f, (Object) OrderType.Lad.f70288e);
            }
            if (z5) {
                if (ordersOnlineDetailsHeaderModel.mo73360T().length() != 0) {
                    z6 = false;
                }
                if (z6) {
                    str = context.getString(R.string.order_txt_order_status_livree);
                } else {
                    str = m148956h(ordersOnlineDetailsHeaderModel.mo73380g(), context);
                }
            } else {
                str = m148956h(ordersOnlineDetailsHeaderModel.mo73380g(), context);
            }
        }
        Intrinsics.checkNotNullExpressionValue(str, "{\n            when (item…)\n            }\n        }");
        return str;
    }

    /* renamed from: d */
    public static final boolean m148952d(@C12580l OrderStatus orderStatus) {
        if (!m148954f(orderStatus) && !m148953e(orderStatus)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static final boolean m148953e(@C12580l OrderStatus orderStatus) {
        boolean z;
        boolean z2;
        if (Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Shipped.f89264e)) {
            z = true;
        } else {
            z = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.ReadyToPick.f89262e);
        }
        if (z) {
            z2 = true;
        } else {
            z2 = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Closed.f89254e);
        }
        if (z2) {
            return true;
        }
        return Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Delivered.f89256e);
    }

    /* renamed from: f */
    public static final boolean m148954f(@C12580l OrderStatus orderStatus) {
        return Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Prepared.f89260e);
    }

    @C12579k
    /* renamed from: g */
    public static final String m148955g(@C12579k OrderStatus orderStatus, @C12579k Context context) {
        String str;
        Intrinsics.checkNotNullParameter(orderStatus, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        if (orderStatus.mo108001b() > 0) {
            str = context.getString(orderStatus.mo108001b());
        } else {
            str = new String();
        }
        Intrinsics.checkNotNullExpressionValue(str, "if (labelResId > 0) {\n  …)\n} else {\n    String()\n}");
        return str;
    }

    @C12579k
    /* renamed from: h */
    public static final String m148956h(@C12579k OrderStatus orderStatus, @C12579k Context context) {
        Intrinsics.checkNotNullParameter(orderStatus, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        if (orderStatus.mo108001b() > 0 && orderStatus.mo108000a() > 0) {
            String string = context.getString(orderStatus.mo108001b());
            String string2 = context.getString(orderStatus.mo108000a());
            return string + " " + string2;
        } else if (orderStatus.mo108001b() <= 0) {
            return new String();
        } else {
            String string3 = context.getString(orderStatus.mo108001b());
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(labelResId)");
            return string3;
        }
    }

    @C12580l
    /* renamed from: i */
    public static final OrderStatusComponent.OngoingOrderStatus m148957i(@C12579k OrderStatus orderStatus) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Intrinsics.checkNotNullParameter(orderStatus, "<this>");
        boolean z6 = true;
        if (Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Affected.f89246e)) {
            z = true;
        } else {
            z = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Validated.f89268e);
        }
        if (z) {
            z2 = true;
        } else {
            z2 = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.AwaitingPreparation.f89250e);
        }
        if (z2) {
            return OrderStatusComponent.OngoingOrderStatus.VALIDATED;
        }
        if (Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.PreparationInProgress.f89258e)) {
            z3 = true;
        } else {
            z3 = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Prepared.f89260e);
        }
        if (z3) {
            return OrderStatusComponent.OngoingOrderStatus.BEING_PROCESSED;
        }
        if (Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Shipped.f89264e)) {
            return OrderStatusComponent.OngoingOrderStatus.PROCESSED;
        }
        if (Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Closed.f89254e)) {
            z4 = true;
        } else {
            z4 = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.ReadyToPick.f89262e);
        }
        if (z4) {
            z5 = true;
        } else {
            z5 = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Delivered.f89256e);
        }
        if (!z5) {
            z6 = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Arrived.f89248e);
        }
        if (z6) {
            return OrderStatusComponent.OngoingOrderStatus.INVOICED;
        }
        return null;
    }
}
