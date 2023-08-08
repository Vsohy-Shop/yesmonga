package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.presentation.p035ui.orders.OrdersDetailsProgressCustomView;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.databinding.c5 */
public final class C36664c5 implements C20752b {
    @C0359n0

    /* renamed from: A */
    public final TextView f90648A;
    @C0359n0

    /* renamed from: B */
    public final View f90649B;
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90650a;
    @C0359n0

    /* renamed from: b */
    public final MaterialButton f90651b;
    @C0359n0

    /* renamed from: c */
    public final Button f90652c;
    @C0359n0

    /* renamed from: d */
    public final Button f90653d;
    @C0359n0

    /* renamed from: e */
    public final Button f90654e;
    @C0359n0

    /* renamed from: f */
    public final Button f90655f;
    @C0359n0

    /* renamed from: g */
    public final Button f90656g;
    @C0359n0

    /* renamed from: h */
    public final Button f90657h;
    @C0359n0

    /* renamed from: i */
    public final Button f90658i;
    @C0359n0

    /* renamed from: j */
    public final Button f90659j;
    @C0359n0

    /* renamed from: k */
    public final ComposeView f90660k;
    @C0359n0

    /* renamed from: l */
    public final OrdersDetailsProgressCustomView f90661l;
    @C0359n0

    /* renamed from: m */
    public final ImageView f90662m;
    @C0359n0

    /* renamed from: n */
    public final Barrier f90663n;
    @C0359n0

    /* renamed from: o */
    public final RecyclerView f90664o;
    @C0359n0

    /* renamed from: p */
    public final TextView f90665p;
    @C0359n0

    /* renamed from: q */
    public final TextView f90666q;
    @C0359n0

    /* renamed from: r */
    public final TextView f90667r;
    @C0359n0

    /* renamed from: s */
    public final TextView f90668s;
    @C0359n0

    /* renamed from: t */
    public final TextView f90669t;
    @C0359n0

    /* renamed from: u */
    public final TextView f90670u;
    @C0359n0

    /* renamed from: v */
    public final TextView f90671v;
    @C0359n0

    /* renamed from: w */
    public final TextView f90672w;
    @C0359n0

    /* renamed from: x */
    public final TextView f90673x;
    @C0359n0

    /* renamed from: y */
    public final TextView f90674y;
    @C0359n0

    /* renamed from: z */
    public final TextView f90675z;

    public C36664c5(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 MaterialButton materialButton, @C0359n0 Button button, @C0359n0 Button button2, @C0359n0 Button button3, @C0359n0 Button button4, @C0359n0 Button button5, @C0359n0 Button button6, @C0359n0 Button button7, @C0359n0 Button button8, @C0359n0 ComposeView composeView, @C0359n0 OrdersDetailsProgressCustomView ordersDetailsProgressCustomView, @C0359n0 ImageView imageView, @C0359n0 Barrier barrier, @C0359n0 RecyclerView recyclerView, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 TextView textView5, @C0359n0 TextView textView6, @C0359n0 TextView textView7, @C0359n0 TextView textView8, @C0359n0 TextView textView9, @C0359n0 TextView textView10, @C0359n0 TextView textView11, @C0359n0 TextView textView12, @C0359n0 View view) {
        this.f90650a = constraintLayout;
        this.f90651b = materialButton;
        this.f90652c = button;
        this.f90653d = button2;
        this.f90654e = button3;
        this.f90655f = button4;
        this.f90656g = button5;
        this.f90657h = button6;
        this.f90658i = button7;
        this.f90659j = button8;
        this.f90660k = composeView;
        this.f90661l = ordersDetailsProgressCustomView;
        this.f90662m = imageView;
        this.f90663n = barrier;
        this.f90664o = recyclerView;
        this.f90665p = textView;
        this.f90666q = textView2;
        this.f90667r = textView3;
        this.f90668s = textView4;
        this.f90669t = textView5;
        this.f90670u = textView6;
        this.f90671v = textView7;
        this.f90672w = textView8;
        this.f90673x = textView9;
        this.f90674y = textView10;
        this.f90675z = textView11;
        this.f90648A = textView12;
        this.f90649B = view;
    }

    @C0359n0
    /* renamed from: a */
    public static C36664c5 m150385a(@C0359n0 View view) {
        View view2 = view;
        int i = R.id.button_holder_additional_order;
        MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view2, R.id.button_holder_additional_order);
        if (materialButton != null) {
            i = R.id.button_holder_order_online_details_ask_cancellation;
            Button button = (Button) C20753c.m96463a(view2, R.id.button_holder_order_online_details_ask_cancellation);
            if (button != null) {
                i = R.id.button_holder_order_online_details_ask_refund;
                Button button2 = (Button) C20753c.m96463a(view2, R.id.button_holder_order_online_details_ask_refund);
                if (button2 != null) {
                    i = R.id.button_holder_order_online_details_change_delivery;
                    Button button3 = (Button) C20753c.m96463a(view2, R.id.button_holder_order_online_details_change_delivery);
                    if (button3 != null) {
                        i = R.id.button_holder_order_online_details_download_bill;
                        Button button4 = (Button) C20753c.m96463a(view2, R.id.button_holder_order_online_details_download_bill);
                        if (button4 != null) {
                            i = R.id.button_holder_order_online_details_download_e_bill;
                            Button button5 = (Button) C20753c.m96463a(view2, R.id.button_holder_order_online_details_download_e_bill);
                            if (button5 != null) {
                                i = R.id.button_holder_order_online_details_follow_command;
                                Button button6 = (Button) C20753c.m96463a(view2, R.id.button_holder_order_online_details_follow_command);
                                if (button6 != null) {
                                    i = R.id.button_holder_order_online_details_order_return_product;
                                    Button button7 = (Button) C20753c.m96463a(view2, R.id.button_holder_order_online_details_order_return_product);
                                    if (button7 != null) {
                                        i = R.id.button_holder_order_online_details_withdrawal_order;
                                        Button button8 = (Button) C20753c.m96463a(view2, R.id.button_holder_order_online_details_withdrawal_order);
                                        if (button8 != null) {
                                            i = R.id.card_holder_order_details_digital_item;
                                            ComposeView composeView = (ComposeView) C20753c.m96463a(view2, R.id.card_holder_order_details_digital_item);
                                            if (composeView != null) {
                                                i = R.id.custom_holder_order_online_details_status_progress;
                                                OrdersDetailsProgressCustomView ordersDetailsProgressCustomView = (OrdersDetailsProgressCustomView) C20753c.m96463a(view2, R.id.custom_holder_order_online_details_status_progress);
                                                if (ordersDetailsProgressCustomView != null) {
                                                    i = R.id.image_holder_order_online_details_slot_icon;
                                                    ImageView imageView = (ImageView) C20753c.m96463a(view2, R.id.image_holder_order_online_details_slot_icon);
                                                    if (imageView != null) {
                                                        i = R.id.order_status_bottom_barrier;
                                                        Barrier barrier = (Barrier) C20753c.m96463a(view2, R.id.order_status_bottom_barrier);
                                                        if (barrier != null) {
                                                            i = R.id.recycler_code_promo;
                                                            RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view2, R.id.recycler_code_promo);
                                                            if (recyclerView != null) {
                                                                i = R.id.text_holder_order_online_details_address;
                                                                TextView textView = (TextView) C20753c.m96463a(view2, R.id.text_holder_order_online_details_address);
                                                                if (textView != null) {
                                                                    i = R.id.text_holder_order_online_details_amount;
                                                                    TextView textView2 = (TextView) C20753c.m96463a(view2, R.id.text_holder_order_online_details_amount);
                                                                    if (textView2 != null) {
                                                                        i = R.id.text_holder_order_online_details_picking_eligibility;
                                                                        TextView textView3 = (TextView) C20753c.m96463a(view2, R.id.text_holder_order_online_details_picking_eligibility);
                                                                        if (textView3 != null) {
                                                                            i = R.id.text_holder_order_online_details_slot_date;
                                                                            TextView textView4 = (TextView) C20753c.m96463a(view2, R.id.text_holder_order_online_details_slot_date);
                                                                            if (textView4 != null) {
                                                                                i = R.id.text_holder_order_online_details_slot_text;
                                                                                TextView textView5 = (TextView) C20753c.m96463a(view2, R.id.text_holder_order_online_details_slot_text);
                                                                                if (textView5 != null) {
                                                                                    i = R.id.text_holder_order_online_details_status_text;
                                                                                    TextView textView6 = (TextView) C20753c.m96463a(view2, R.id.text_holder_order_online_details_status_text);
                                                                                    if (textView6 != null) {
                                                                                        i = R.id.text_holder_order_online_details_status_value;
                                                                                        TextView textView7 = (TextView) C20753c.m96463a(view2, R.id.text_holder_order_online_details_status_value);
                                                                                        if (textView7 != null) {
                                                                                            i = R.id.text_holder_order_online_details_store_name;
                                                                                            TextView textView8 = (TextView) C20753c.m96463a(view2, R.id.text_holder_order_online_details_store_name);
                                                                                            if (textView8 != null) {
                                                                                                i = R.id.text_holder_order_online_details_type;
                                                                                                TextView textView9 = (TextView) C20753c.m96463a(view2, R.id.text_holder_order_online_details_type);
                                                                                                if (textView9 != null) {
                                                                                                    i = R.id.text_order_details_title;
                                                                                                    TextView textView10 = (TextView) C20753c.m96463a(view2, R.id.text_order_details_title);
                                                                                                    if (textView10 != null) {
                                                                                                        i = R.id.total_order_amount_text;
                                                                                                        TextView textView11 = (TextView) C20753c.m96463a(view2, R.id.total_order_amount_text);
                                                                                                        if (textView11 != null) {
                                                                                                            i = R.id.total_text;
                                                                                                            TextView textView12 = (TextView) C20753c.m96463a(view2, R.id.total_text);
                                                                                                            if (textView12 != null) {
                                                                                                                i = R.id.view_holder_order_online_details_divider;
                                                                                                                View a = C20753c.m96463a(view2, R.id.view_holder_order_online_details_divider);
                                                                                                                if (a != null) {
                                                                                                                    return new C36664c5((ConstraintLayout) view2, materialButton, button, button2, button3, button4, button5, button6, button7, button8, composeView, ordersDetailsProgressCustomView, imageView, barrier, recyclerView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, a);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36664c5 m150386c(@C0359n0 LayoutInflater layoutInflater) {
        return m150387d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36664c5 m150387d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_order_details_online_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150385a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90650a;
    }
}
