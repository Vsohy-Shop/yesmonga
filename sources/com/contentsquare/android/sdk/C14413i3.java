package com.contentsquare.android.sdk;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.core.util.C17994n;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: com.contentsquare.android.sdk.i3 */
public class C14413i3 {

    /* renamed from: a */
    public final C14453jf f35620a = new C14453jf("ViewUtil");

    /* renamed from: com.contentsquare.android.sdk.i3$a */
    public class C14414a implements Comparator<C17994n<View, Integer>> {
        public C14414a() {
        }

        /* renamed from: a */
        public int compare(C17994n<View, Integer> nVar, C17994n<View, Integer> nVar2) {
            return C14921z6.m64200f(((Integer) nVar.f46483b).intValue(), ((Integer) nVar2.f46483b).intValue());
        }
    }

    /* renamed from: a */
    public static int m62074a(int i, Context context) {
        return C14921z6.m64196b(((float) i) / (((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f));
    }

    /* renamed from: d */
    public static <T> T m62075d(Class<T> cls, ViewGroup viewGroup) {
        if (cls.isAssignableFrom(viewGroup.getClass())) {
            return viewGroup;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(viewGroup);
        while (!linkedList.isEmpty()) {
            ViewGroup viewGroup2 = (ViewGroup) linkedList.remove();
            int i = 0;
            while (true) {
                if (i < viewGroup2.getChildCount()) {
                    T childAt = viewGroup2.getChildAt(i);
                    if (cls.isAssignableFrom(childAt.getClass())) {
                        return childAt;
                    }
                    if (childAt instanceof ViewGroup) {
                        linkedList.add((ViewGroup) childAt);
                    }
                    i++;
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    public static void m62076e(Context context, Integer num) {
        Toast.makeText(context, num.intValue(), 0).show();
    }

    /* renamed from: f */
    public static void m62077f(ImageView imageView, int i) {
        imageView.setImageResource(i);
    }

    /* renamed from: h */
    public static void m62078h(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: i */
    public static void m62079i(View view) {
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: b */
    public View mo35515b(View view) {
        ViewParent parent = view.getParent();
        return parent instanceof View ? (View) parent : view;
    }

    /* renamed from: c */
    public View mo35516c(ViewGroup viewGroup) {
        try {
            PriorityQueue priorityQueue = new PriorityQueue(10, new C14414a());
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                this.f35620a.mo35674c("View Group without children detected, returning", viewGroup.toString());
                return null;
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    if (childAt.getVisibility() == 0) {
                        priorityQueue.add(new C17994n(childAt, Integer.valueOf(C14921z6.m64197c(childAt.getWidth(), childAt.getHeight()))));
                    }
                }
                this.f35620a.mo35677f("Child was null or invisible, skipping, %s", childAt);
            }
            if (priorityQueue.isEmpty()) {
                return null;
            }
            return (View) ((C17994n) priorityQueue.poll()).f46482a;
        } catch (NullPointerException e) {
            this.f35620a.mo35678g(e, "We got a NullPointerException error, returning the root view", new Object[0]);
            return null;
        }
    }

    /* renamed from: g */
    public View mo35517g(ViewGroup viewGroup) {
        try {
            ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
            arrayBlockingQueue.add(viewGroup);
            this.f35620a.mo35674c("Finding the biggest segment in %s", viewGroup.toString());
            while (!arrayBlockingQueue.isEmpty()) {
                ViewGroup viewGroup2 = (ViewGroup) arrayBlockingQueue.poll();
                View c = mo35516c(viewGroup2);
                if (c == null) {
                    return viewGroup2;
                }
                if (!(c instanceof AdapterView)) {
                    if (!c.getClass().toString().contains(RecyclerView.f51383R1)) {
                        if (c instanceof ViewGroup) {
                            this.f35620a.mo35674c("Adding child for processing: %s", c);
                            arrayBlockingQueue.add((ViewGroup) c);
                        } else {
                            View b = mo35515b(c);
                            this.f35620a.mo35674c("Found biggest child, returning: %s", b);
                            return b;
                        }
                    }
                }
                this.f35620a.mo35674c("Found a RecyclerView, returning as biggest: %s", c);
                return c;
            }
        } catch (NullPointerException e) {
            this.f35620a.mo35678g(e, "We got a NullPointerException error, returning the root view", new Object[0]);
        }
        this.f35620a.mo35677f("We have an error in processing, returning the root view.", new Object[0]);
        return viewGroup;
    }
}
