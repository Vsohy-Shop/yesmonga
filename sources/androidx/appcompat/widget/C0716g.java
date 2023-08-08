package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0364q;
import androidx.annotation.C0375v;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.content.res.C0507a;
import androidx.appcompat.widget.C0806w0;
import androidx.core.graphics.C17586h0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.g */
public final class C0716g {

    /* renamed from: b */
    public static final String f2376b = "AppCompatDrawableManag";

    /* renamed from: c */
    public static final boolean f2377c = false;

    /* renamed from: d */
    public static final PorterDuff.Mode f2378d = PorterDuff.Mode.SRC_IN;

    /* renamed from: e */
    public static C0716g f2379e;

    /* renamed from: a */
    public C0806w0 f2380a;

    /* renamed from: androidx.appcompat.widget.g$a */
    public class C0717a implements C0806w0.C0812f {

        /* renamed from: a */
        public final int[] f2381a = {C0387a.C0393f.abc_textfield_search_default_mtrl_alpha, C0387a.C0393f.abc_textfield_default_mtrl_alpha, C0387a.C0393f.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        public final int[] f2382b = {C0387a.C0393f.abc_ic_commit_search_api_mtrl_alpha, C0387a.C0393f.abc_seekbar_tick_mark_material, C0387a.C0393f.abc_ic_menu_share_mtrl_alpha, C0387a.C0393f.abc_ic_menu_copy_mtrl_am_alpha, C0387a.C0393f.abc_ic_menu_cut_mtrl_alpha, C0387a.C0393f.abc_ic_menu_selectall_mtrl_alpha, C0387a.C0393f.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        public final int[] f2383c = {C0387a.C0393f.abc_textfield_activated_mtrl_alpha, C0387a.C0393f.abc_textfield_search_activated_mtrl_alpha, C0387a.C0393f.abc_cab_background_top_mtrl_alpha, C0387a.C0393f.abc_text_cursor_material, C0387a.C0393f.abc_text_select_handle_left_mtrl, C0387a.C0393f.abc_text_select_handle_middle_mtrl, C0387a.C0393f.abc_text_select_handle_right_mtrl};

        /* renamed from: d */
        public final int[] f2384d = {C0387a.C0393f.abc_popup_background_mtrl_mult, C0387a.C0393f.abc_cab_background_internal_bg, C0387a.C0393f.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        public final int[] f2385e = {C0387a.C0393f.abc_tab_indicator_material, C0387a.C0393f.abc_textfield_search_material};

        /* renamed from: f */
        public final int[] f2386f = {C0387a.C0393f.abc_btn_check_material, C0387a.C0393f.abc_btn_radio_material, C0387a.C0393f.abc_btn_check_material_anim, C0387a.C0393f.abc_btn_radio_material_anim};

        /* renamed from: a */
        public Drawable mo3433a(@C0359n0 C0806w0 w0Var, @C0359n0 Context context, int i) {
            if (i == C0387a.C0393f.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{w0Var.mo3744j(context, C0387a.C0393f.abc_cab_background_internal_bg), w0Var.mo3744j(context, C0387a.C0393f.abc_cab_background_top_mtrl_alpha)});
            } else if (i == C0387a.C0393f.abc_ratingbar_material) {
                return mo3444l(w0Var, context, C0387a.C0392e.abc_star_big);
            } else {
                if (i == C0387a.C0393f.abc_ratingbar_indicator_material) {
                    return mo3444l(w0Var, context, C0387a.C0392e.abc_star_medium);
                }
                if (i == C0387a.C0393f.abc_ratingbar_small_material) {
                    return mo3444l(w0Var, context, C0387a.C0392e.abc_star_small);
                }
                return null;
            }
        }

        /* renamed from: b */
        public ColorStateList mo3434b(@C0359n0 Context context, int i) {
            if (i == C0387a.C0393f.abc_edit_text_material) {
                return C0507a.m2345a(context, C0387a.C0391d.abc_tint_edittext);
            }
            if (i == C0387a.C0393f.abc_switch_track_mtrl_alpha) {
                return C0507a.m2345a(context, C0387a.C0391d.abc_tint_switch_track);
            }
            if (i == C0387a.C0393f.abc_switch_thumb_material) {
                return mo3443k(context);
            }
            if (i == C0387a.C0393f.abc_btn_default_mtrl_shape) {
                return mo3442j(context);
            }
            if (i == C0387a.C0393f.abc_btn_borderless_material) {
                return mo3439g(context);
            }
            if (i == C0387a.C0393f.abc_btn_colored_material) {
                return mo3441i(context);
            }
            if (i == C0387a.C0393f.abc_spinner_mtrl_am_alpha || i == C0387a.C0393f.abc_spinner_textfield_background_material) {
                return C0507a.m2345a(context, C0387a.C0391d.abc_tint_spinner);
            }
            if (mo3438f(this.f2382b, i)) {
                return C0705c1.m3426f(context, C0387a.C0389b.colorControlNormal);
            }
            if (mo3438f(this.f2385e, i)) {
                return C0507a.m2345a(context, C0387a.C0391d.abc_tint_default);
            }
            if (mo3438f(this.f2386f, i)) {
                return C0507a.m2345a(context, C0387a.C0391d.abc_tint_btn_checkable);
            }
            if (i == C0387a.C0393f.abc_seekbar_thumb_material) {
                return C0507a.m2345a(context, C0387a.C0391d.abc_tint_seek_thumb);
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x006c A[RETURN] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo3435c(@androidx.annotation.C0359n0 android.content.Context r8, int r9, @androidx.annotation.C0359n0 android.graphics.drawable.Drawable r10) {
            /*
                r7 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0716g.f2378d
                int[] r1 = r7.f2381a
                boolean r1 = r7.mo3438f(r1, r9)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L_0x0015
                int r9 = androidx.appcompat.C0387a.C0389b.colorControlNormal
            L_0x0011:
                r1 = r0
                r5 = r2
            L_0x0013:
                r0 = r4
                goto L_0x004f
            L_0x0015:
                int[] r1 = r7.f2383c
                boolean r1 = r7.mo3438f(r1, r9)
                if (r1 == 0) goto L_0x0020
                int r9 = androidx.appcompat.C0387a.C0389b.colorControlActivated
                goto L_0x0011
            L_0x0020:
                int[] r1 = r7.f2384d
                boolean r1 = r7.mo3438f(r1, r9)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L_0x0032
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L_0x002d:
                r1 = r0
                r0 = r4
                r9 = r5
                r5 = r2
                goto L_0x004f
            L_0x0032:
                int r1 = androidx.appcompat.C0387a.C0393f.abc_list_divider_mtrl_alpha
                if (r9 != r1) goto L_0x0046
                r9 = 1109603123(0x42233333, float:40.8)
                int r9 = java.lang.Math.round(r9)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r2
                r6 = r0
                r0 = r9
                r9 = r1
                r1 = r6
                goto L_0x004f
            L_0x0046:
                int r1 = androidx.appcompat.C0387a.C0393f.abc_dialog_material_background
                if (r9 != r1) goto L_0x004b
                goto L_0x002d
            L_0x004b:
                r1 = r0
                r9 = r3
                r5 = r9
                goto L_0x0013
            L_0x004f:
                if (r5 == 0) goto L_0x006c
                boolean r3 = androidx.appcompat.widget.C0725i0.m3580a(r10)
                if (r3 == 0) goto L_0x005b
                android.graphics.drawable.Drawable r10 = r10.mutate()
            L_0x005b:
                int r8 = androidx.appcompat.widget.C0705c1.m3424d(r8, r9)
                android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.C0716g.m3507e(r8, r1)
                r10.setColorFilter(r8)
                if (r0 == r4) goto L_0x006b
                r10.setAlpha(r0)
            L_0x006b:
                return r2
            L_0x006c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0716g.C0717a.mo3435c(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        /* renamed from: d */
        public PorterDuff.Mode mo3436d(int i) {
            if (i == C0387a.C0393f.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        /* renamed from: e */
        public boolean mo3437e(@C0359n0 Context context, int i, @C0359n0 Drawable drawable) {
            if (i == C0387a.C0393f.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int i2 = C0387a.C0389b.colorControlNormal;
                mo3445m(findDrawableByLayerId, C0705c1.m3424d(context, i2), C0716g.f2378d);
                mo3445m(layerDrawable.findDrawableByLayerId(16908303), C0705c1.m3424d(context, i2), C0716g.f2378d);
                mo3445m(layerDrawable.findDrawableByLayerId(16908301), C0705c1.m3424d(context, C0387a.C0389b.colorControlActivated), C0716g.f2378d);
                return true;
            } else if (i != C0387a.C0393f.abc_ratingbar_material && i != C0387a.C0393f.abc_ratingbar_indicator_material && i != C0387a.C0393f.abc_ratingbar_small_material) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                mo3445m(layerDrawable2.findDrawableByLayerId(16908288), C0705c1.m3423c(context, C0387a.C0389b.colorControlNormal), C0716g.f2378d);
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908303);
                int i3 = C0387a.C0389b.colorControlActivated;
                mo3445m(findDrawableByLayerId2, C0705c1.m3424d(context, i3), C0716g.f2378d);
                mo3445m(layerDrawable2.findDrawableByLayerId(16908301), C0705c1.m3424d(context, i3), C0716g.f2378d);
                return true;
            }
        }

        /* renamed from: f */
        public final boolean mo3438f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        public final ColorStateList mo3439g(@C0359n0 Context context) {
            return mo3440h(context, 0);
        }

        /* renamed from: h */
        public final ColorStateList mo3440h(@C0359n0 Context context, @C0354l int i) {
            int d = C0705c1.m3424d(context, C0387a.C0389b.colorControlHighlight);
            int c = C0705c1.m3423c(context, C0387a.C0389b.colorButtonNormal);
            return new ColorStateList(new int[][]{C0705c1.f2338c, C0705c1.f2341f, C0705c1.f2339d, C0705c1.f2345j}, new int[]{c, C17586h0.m80583t(d, i), C17586h0.m80583t(d, i), i});
        }

        /* renamed from: i */
        public final ColorStateList mo3441i(@C0359n0 Context context) {
            return mo3440h(context, C0705c1.m3424d(context, C0387a.C0389b.colorAccent));
        }

        /* renamed from: j */
        public final ColorStateList mo3442j(@C0359n0 Context context) {
            return mo3440h(context, C0705c1.m3424d(context, C0387a.C0389b.colorButtonNormal));
        }

        /* renamed from: k */
        public final ColorStateList mo3443k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i = C0387a.C0389b.colorSwitchThumbNormal;
            ColorStateList f = C0705c1.m3426f(context, i);
            if (f == null || !f.isStateful()) {
                iArr[0] = C0705c1.f2338c;
                iArr2[0] = C0705c1.m3423c(context, i);
                iArr[1] = C0705c1.f2342g;
                iArr2[1] = C0705c1.m3424d(context, C0387a.C0389b.colorControlActivated);
                iArr[2] = C0705c1.f2345j;
                iArr2[2] = C0705c1.m3424d(context, i);
            } else {
                int[] iArr3 = C0705c1.f2338c;
                iArr[0] = iArr3;
                iArr2[0] = f.getColorForState(iArr3, 0);
                iArr[1] = C0705c1.f2342g;
                iArr2[1] = C0705c1.m3424d(context, C0387a.C0389b.colorControlActivated);
                iArr[2] = C0705c1.f2345j;
                iArr2[2] = f.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        public final LayerDrawable mo3444l(@C0359n0 C0806w0 w0Var, @C0359n0 Context context, @C0364q int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable j = w0Var.mo3744j(context, C0387a.C0393f.abc_star_black_48dp);
            Drawable j2 = w0Var.mo3744j(context, C0387a.C0393f.abc_star_half_black_48dp);
            if ((j instanceof BitmapDrawable) && j.getIntrinsicWidth() == dimensionPixelSize && j.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) j;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((j2 instanceof BitmapDrawable) && j2.getIntrinsicWidth() == dimensionPixelSize && j2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        /* renamed from: m */
        public final void mo3445m(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (C0725i0.m3580a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0716g.f2378d;
            }
            drawable.setColorFilter(C0716g.m3507e(i, mode));
        }
    }

    /* renamed from: b */
    public static synchronized C0716g m3506b() {
        C0716g gVar;
        synchronized (C0716g.class) {
            if (f2379e == null) {
                m3508i();
            }
            gVar = f2379e;
        }
        return gVar;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m3507e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter l;
        synchronized (C0716g.class) {
            l = C0806w0.m3885l(i, mode);
        }
        return l;
    }

    /* renamed from: i */
    public static synchronized void m3508i() {
        synchronized (C0716g.class) {
            if (f2379e == null) {
                C0716g gVar = new C0716g();
                f2379e = gVar;
                gVar.f2380a = C0806w0.m3884h();
                f2379e.f2380a.mo3752u(new C0717a());
            }
        }
    }

    /* renamed from: j */
    public static void m3509j(Drawable drawable, C0715f1 f1Var, int[] iArr) {
        C0806w0.m3888w(drawable, f1Var, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable mo3427c(@C0359n0 Context context, @C0375v int i) {
        return this.f2380a.mo3744j(context, i);
    }

    /* renamed from: d */
    public synchronized Drawable mo3428d(@C0359n0 Context context, @C0375v int i, boolean z) {
        return this.f2380a.mo3745k(context, i, z);
    }

    /* renamed from: f */
    public synchronized ColorStateList mo3429f(@C0359n0 Context context, @C0375v int i) {
        return this.f2380a.mo3746m(context, i);
    }

    /* renamed from: g */
    public synchronized void mo3430g(@C0359n0 Context context) {
        this.f2380a.mo3750s(context);
    }

    /* renamed from: h */
    public synchronized Drawable mo3431h(@C0359n0 Context context, @C0359n0 C0793t1 t1Var, @C0375v int i) {
        return this.f2380a.mo3751t(context, t1Var, i);
    }

    /* renamed from: k */
    public boolean mo3432k(@C0359n0 Context context, @C0375v int i, @C0359n0 Drawable drawable) {
        return this.f2380a.mo3754x(context, i, drawable);
    }
}
