package com.usabilla.sdk.ubform.customViews;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.core.content.C17318d;
import com.usabilla.sdk.ubform.C9747c;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/widget/SeekBar;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class SliderSeekBar$view$2 extends Lambda implements C11289a<SeekBar> {
    final /* synthetic */ Context $context;
    final /* synthetic */ SliderSeekBar this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderSeekBar$view$2(Context context, SliderSeekBar sliderSeekBar) {
        super(0);
        this.$context = context;
        this.this$0 = sliderSeekBar;
    }

    @C12579k
    /* renamed from: a */
    public final SeekBar invoke() {
        SeekBar seekBar = new SeekBar(new ContextThemeWrapper(this.$context, this.this$0.f26767e));
        Context context = this.$context;
        seekBar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        seekBar.setThumb(C17318d.m79726i(context, C9747c.C9755h.ub_slider_view_thumb));
        seekBar.setThumbOffset(0);
        seekBar.setPadding(0, 0, 0, 0);
        seekBar.setFocusable(false);
        seekBar.setImportantForAccessibility(2);
        return seekBar;
    }
}
