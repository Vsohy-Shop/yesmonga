package androidx.compose.material3;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.material3.C8284t2;
import androidx.compose.material3.C8372y1;
import androidx.compose.p004ui.C8776o;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8582l1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.core.p027os.C17785f;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nStrings.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material3/Strings_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,208:1\n76#2:209\n76#2:210\n76#2:211\n*S KotlinDebug\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material3/Strings_androidKt\n*L\n30#1:209\n31#1:210\n205#1:211\n*E\n"})
/* renamed from: androidx.compose.material3.u2 */
public final class C8357u2 {
    @C8540g
    @C8582l1
    @C12579k
    /* renamed from: a */
    public static final String m29348a(int i, @C12580l C8592o oVar, int i2) {
        String str;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-176762646, i2, -1, "androidx.compose.material3.getString (Strings.android.kt:28)");
        }
        oVar.mo15032w(AndroidCompositionLocals_androidKt.m70951f());
        Resources resources = ((Context) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70952g())).getResources();
        C8284t2.C8285a aVar = C8284t2.f20507b;
        if (C8284t2.m27615q0(i, aVar.mo13032R())) {
            str = resources.getString(C8776o.C8779c.navigation_menu);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.navigation_menu)");
        } else if (C8284t2.m27615q0(i, aVar.mo13050f())) {
            str = resources.getString(C8776o.C8779c.close_drawer);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.close_drawer)");
        } else if (C8284t2.m27615q0(i, aVar.mo13052g())) {
            str = resources.getString(C8776o.C8779c.close_sheet);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.close_sheet)");
        } else if (C8284t2.m27615q0(i, aVar.mo13027M())) {
            str = resources.getString(C8776o.C8779c.default_error_message);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.st…ng.default_error_message)");
        } else if (C8284t2.m27615q0(i, aVar.mo13029O())) {
            str = resources.getString(C8776o.C8779c.dropdown_menu);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.dropdown_menu)");
        } else if (C8284t2.m27615q0(i, aVar.mo13035U())) {
            str = resources.getString(C8776o.C8779c.range_start);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.range_start)");
        } else if (C8284t2.m27615q0(i, aVar.mo13034T())) {
            str = resources.getString(C8776o.C8779c.range_end);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.range_end)");
        } else if (C8284t2.m27615q0(i, aVar.mo13028N())) {
            str = resources.getString(C8372y1.C8373a.dialog);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(andr…aterial3.R.string.dialog)");
        } else if (C8284t2.m27615q0(i, aVar.mo13031Q())) {
            str = resources.getString(C8372y1.C8373a.expanded);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(andr…erial3.R.string.expanded)");
        } else if (C8284t2.m27615q0(i, aVar.mo13030P())) {
            str = resources.getString(C8372y1.C8373a.collapsed);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(andr…rial3.R.string.collapsed)");
        } else if (C8284t2.m27615q0(i, aVar.mo13036V())) {
            str = resources.getString(C8372y1.C8373a.snackbar_dismiss);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …nackbar_dismiss\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13033S())) {
            str = resources.getString(C8372y1.C8373a.search_bar_search);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …arch_bar_search\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13037W())) {
            str = resources.getString(C8372y1.C8373a.suggestions_available);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(andr…ng.suggestions_available)");
        } else if (C8284t2.m27615q0(i, aVar.mo13016B())) {
            str = resources.getString(C8372y1.C8373a.date_picker_title);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …te_picker_title\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13067p())) {
            str = resources.getString(C8372y1.C8373a.date_picker_headline);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …picker_headline\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13018D())) {
            str = resources.getString(C8372y1.C8373a.date_picker_year_picker_pane_title);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …cker_pane_title\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13015A())) {
            str = resources.getString(C8372y1.C8373a.date_picker_switch_to_year_selection);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …_year_selection\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13074w())) {
            str = resources.getString(C8372y1.C8373a.date_picker_switch_to_day_selection);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …o_day_selection\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13076y())) {
            str = resources.getString(C8372y1.C8373a.date_picker_switch_to_next_month);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …h_to_next_month\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13077z())) {
            str = resources.getString(C8372y1.C8373a.date_picker_switch_to_previous_month);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …_previous_month\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13069r())) {
            str = resources.getString(C8372y1.C8373a.date_picker_navigate_to_year_description);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …ear_description\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13068q())) {
            str = resources.getString(C8372y1.C8373a.date_picker_headline_description);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …ine_description\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13070s())) {
            str = resources.getString(C8372y1.C8373a.date_picker_no_selection_description);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …ion_description\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13017C())) {
            str = resources.getString(C8372y1.C8373a.date_picker_today_description);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …day_description\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13072u())) {
            str = resources.getString(C8372y1.C8373a.date_picker_scroll_to_later_years);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …_to_later_years\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13071t())) {
            str = resources.getString(C8372y1.C8373a.date_picker_scroll_to_earlier_years);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …o_earlier_years\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13066o())) {
            str = resources.getString(C8372y1.C8373a.date_input_title);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …ate_input_title\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13054h())) {
            str = resources.getString(C8372y1.C8373a.date_input_headline);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …_input_headline\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13064m())) {
            str = resources.getString(C8372y1.C8373a.date_input_label);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …ate_input_label\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13056i())) {
            str = resources.getString(C8372y1.C8373a.date_input_headline_description);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …ine_description\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13065n())) {
            str = resources.getString(C8372y1.C8373a.date_input_no_input_description);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …put_description\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13060k())) {
            str = resources.getString(C8372y1.C8373a.date_input_invalid_not_allowed);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …lid_not_allowed\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13058j())) {
            str = resources.getString(C8372y1.C8373a.date_input_invalid_for_pattern);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …lid_for_pattern\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13062l())) {
            str = resources.getString(C8372y1.C8373a.date_input_invalid_year_range);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …alid_year_range\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13073v())) {
            str = resources.getString(C8372y1.C8373a.date_picker_switch_to_calendar_mode);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …o_calendar_mode\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13075x())) {
            str = resources.getString(C8372y1.C8373a.date_picker_switch_to_input_mode);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …h_to_input_mode\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13026L())) {
            str = resources.getString(C8372y1.C8373a.date_range_picker_title);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …ge_picker_title\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13025K())) {
            str = resources.getString(C8372y1.C8373a.date_range_picker_start_headline);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …_start_headline\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13022H())) {
            str = resources.getString(C8372y1.C8373a.date_range_picker_end_headline);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …er_end_headline\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13023I())) {
            str = resources.getString(C8372y1.C8373a.date_range_picker_scroll_to_next_month);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …l_to_next_month\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13024J())) {
            str = resources.getString(C8372y1.C8373a.date_range_picker_scroll_to_previous_month);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …_previous_month\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13021G())) {
            str = resources.getString(C8372y1.C8373a.date_range_picker_day_in_range);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …er_day_in_range\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13020F())) {
            str = resources.getString(C8372y1.C8373a.date_range_input_title);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …nge_input_title\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13019E())) {
            str = resources.getString(C8372y1.C8373a.date_range_input_invalid_range_input);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …lid_range_input\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13044c())) {
            str = resources.getString(C8372y1.C8373a.bottom_sheet_drag_handle_description);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …dle_description\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13048e())) {
            str = resources.getString(C8372y1.C8373a.bottom_sheet_collapse_description);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …pse_description\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13042b())) {
            str = resources.getString(C8372y1.C8373a.bottom_sheet_dismiss_description);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …iss_description\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13046d())) {
            str = resources.getString(C8372y1.C8373a.bottom_sheet_expand_description);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …and_description\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13059j0())) {
            str = resources.getString(C8372y1.C8373a.tooltip_long_press_label);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …ong_press_label\n        )");
        } else if (C8284t2.m27615q0(i, aVar.mo13039Y())) {
            str = resources.getString(C8372y1.C8373a.time_picker_am);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   ….R.string.time_picker_am)");
        } else if (C8284t2.m27615q0(i, aVar.mo13055h0())) {
            str = resources.getString(C8372y1.C8373a.time_picker_pm);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   ….R.string.time_picker_pm)");
        } else if (C8284t2.m27615q0(i, aVar.mo13057i0())) {
            str = resources.getString(C8372y1.C8373a.time_picker_period_toggle_description);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …eriod_toggle_description)");
        } else if (C8284t2.m27615q0(i, aVar.mo13049e0())) {
            str = resources.getString(C8372y1.C8373a.time_picker_minute_selection);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …_picker_minute_selection)");
        } else if (C8284t2.m27615q0(i, aVar.mo13041a0())) {
            str = resources.getString(C8372y1.C8373a.time_picker_hour_selection);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …me_picker_hour_selection)");
        } else if (C8284t2.m27615q0(i, aVar.mo13043b0())) {
            str = resources.getString(C8372y1.C8373a.time_picker_hour_suffix);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   ….time_picker_hour_suffix)");
        } else if (C8284t2.m27615q0(i, aVar.mo13051f0())) {
            str = resources.getString(C8372y1.C8373a.time_picker_minute_suffix);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …ime_picker_minute_suffix)");
        } else if (C8284t2.m27615q0(i, aVar.mo13038X())) {
            str = resources.getString(C8372y1.C8373a.time_picker_hour_24h_suffix);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …e_picker_hour_24h_suffix)");
        } else if (C8284t2.m27615q0(i, aVar.mo13040Z())) {
            str = resources.getString(C8372y1.C8373a.time_picker_hour);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   ….string.time_picker_hour)");
        } else if (C8284t2.m27615q0(i, aVar.mo13047d0())) {
            str = resources.getString(C8372y1.C8373a.time_picker_minute);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …tring.time_picker_minute)");
        } else if (C8284t2.m27615q0(i, aVar.mo13045c0())) {
            str = resources.getString(C8372y1.C8373a.time_picker_hour_text_field);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …e_picker_hour_text_field)");
        } else if (C8284t2.m27615q0(i, aVar.mo13053g0())) {
            str = resources.getString(C8372y1.C8373a.time_picker_minute_text_field);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …picker_minute_text_field)");
        } else if (C8284t2.m27615q0(i, aVar.mo13061k0())) {
            str = resources.getString(C8372y1.C8373a.tooltip_pane_description);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …tooltip_pane_description)");
        } else {
            str = "";
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return str;
    }

    @C8540g
    @C8582l1
    @C12579k
    /* renamed from: b */
    public static final String m29349b(int i, @C12579k Object[] objArr, @C12580l C8592o oVar, int i2) {
        Intrinsics.checkNotNullParameter(objArr, "formatArgs");
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1126124681, i2, -1, "androidx.compose.material3.getString (Strings.android.kt:201)");
        }
        String a = m29348a(i, oVar, i2 & 14);
        Locale d = C17785f.m81175a((Configuration) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70951f())).mo52233d(0);
        if (d == null) {
            d = Locale.getDefault();
        }
        C11368t0 t0Var = C11368t0.f28504a;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(d, a, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return format;
    }
}
