package com.usabilla.sdk.ubform.sdk.field.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.widget.SeekBar;
import com.usabilla.sdk.ubform.customViews.SliderSeekBar;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/customViews/SliderSeekBar;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class SliderView$seekBar$2 extends Lambda implements C11289a<SliderSeekBar> {
    final /* synthetic */ Context $context;
    final /* synthetic */ SliderView this$0;

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.view.SliderView$seekBar$2$a */
    public static final class C10032a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        public final /* synthetic */ SliderView f27566a;

        public C10032a(SliderView sliderView) {
            this.f27566a = sliderView;
        }

        public void onProgressChanged(@C12579k SeekBar seekBar, int i, boolean z) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            SliderView.m37865o(this.f27566a).mo21035i0(i);
            this.f27566a.getResultLabel().setText(SliderView.m37865o(this.f27566a).mo20862G());
        }

        public void onStartTrackingTouch(@C12580l SeekBar seekBar) {
        }

        public void onStopTrackingTouch(@C12579k SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            SliderView.m37865o(this.f27566a).mo21035i0(SliderView.m37865o(this.f27566a).getProgress());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderView$seekBar$2(Context context, SliderView sliderView) {
        super(0);
        this.$context = context;
        this.this$0 = sliderView;
    }

    @C12579k
    /* renamed from: a */
    public final SliderSeekBar invoke() {
        SliderSeekBar sliderSeekBar = new SliderSeekBar(new ContextThemeWrapper(this.$context, this.this$0.f27558E0), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        SliderView sliderView = this.this$0;
        sliderSeekBar.setProgress(SliderView.m37865o(sliderView).getProgress());
        sliderSeekBar.setMax(SliderView.m37865o(sliderView).mo20864S());
        sliderSeekBar.setMin(SliderView.m37865o(sliderView).mo20867q());
        sliderSeekBar.setTextHigh(SliderView.m37865o(sliderView).mo20866l());
        sliderSeekBar.setTextLow(SliderView.m37865o(sliderView).mo20863N());
        sliderSeekBar.setOnSeekBarChangeListener(new C10032a(sliderView));
        return sliderSeekBar;
    }
}
