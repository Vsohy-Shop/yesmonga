package com.google.android.play.core.splitinstall;

import android.app.Activity;
import android.content.IntentSender;
import android.support.annotation.NonNull;
import com.google.android.play.core.common.C32014a;
import com.google.android.play.core.tasks.C32227d;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.google.android.play.core.splitinstall.c */
public interface C32158c {
    /* renamed from: a */
    boolean mo92921a(@NonNull C32167f fVar, @NonNull Activity activity, int i) throws IntentSender.SendIntentException;

    @NonNull
    /* renamed from: b */
    C32227d<Void> mo92922b(List<Locale> list);

    @NonNull
    /* renamed from: c */
    C32227d<Void> mo92923c(int i);

    @NonNull
    /* renamed from: d */
    C32227d<List<C32167f>> mo92924d();

    @NonNull
    /* renamed from: e */
    C32227d<Void> mo92925e(List<Locale> list);

    /* renamed from: f */
    boolean mo92926f(@NonNull C32167f fVar, @NonNull C32014a aVar, int i) throws IntentSender.SendIntentException;

    /* renamed from: g */
    C32227d<Integer> mo92927g(@NonNull C32164e eVar);

    /* renamed from: h */
    void mo92928h(@NonNull C32169g gVar);

    @NonNull
    /* renamed from: i */
    C32227d<Void> mo92929i(List<String> list);

    @NonNull
    /* renamed from: j */
    C32227d<C32167f> mo92930j(int i);

    /* renamed from: k */
    void mo92931k(@NonNull C32169g gVar);

    @NonNull
    /* renamed from: l */
    Set<String> mo92932l();

    @NonNull
    /* renamed from: m */
    C32227d<Void> mo92933m(List<String> list);

    /* renamed from: n */
    void mo92934n(@NonNull C32169g gVar);

    /* renamed from: o */
    void mo92935o(@NonNull C32169g gVar);

    @NonNull
    /* renamed from: p */
    Set<String> mo92936p();
}
