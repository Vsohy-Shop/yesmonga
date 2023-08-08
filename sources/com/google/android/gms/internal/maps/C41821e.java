package com.google.android.gms.internal.maps;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.maps.e */
public interface C41821e extends IInterface {
    /* renamed from: A0 */
    void mo136360A0(C41016d dVar) throws RemoteException;

    /* renamed from: G2 */
    void mo136361G2(Cap cap) throws RemoteException;

    /* renamed from: H2 */
    void mo136362H2(int i) throws RemoteException;

    /* renamed from: I */
    void mo136363I(float f) throws RemoteException;

    /* renamed from: L7 */
    boolean mo136364L7(@Nullable C41821e eVar) throws RemoteException;

    /* renamed from: O */
    void mo136365O(int i) throws RemoteException;

    /* renamed from: P4 */
    void mo136366P4(@Nullable List<PatternItem> list) throws RemoteException;

    /* renamed from: Z2 */
    void mo136367Z2(boolean z) throws RemoteException;

    /* renamed from: e */
    float mo136368e() throws RemoteException;

    /* renamed from: f */
    float mo136369f() throws RemoteException;

    /* renamed from: h */
    int mo136370h() throws RemoteException;

    /* renamed from: j */
    int mo136371j() throws RemoteException;

    /* renamed from: k */
    C41016d mo136372k() throws RemoteException;

    /* renamed from: n */
    void mo136373n(boolean z) throws RemoteException;

    /* renamed from: o */
    int mo136374o() throws RemoteException;

    /* renamed from: p */
    Cap mo136375p() throws RemoteException;

    /* renamed from: p2 */
    void mo136376p2(boolean z) throws RemoteException;

    /* renamed from: q */
    String mo136377q() throws RemoteException;

    /* renamed from: r */
    List<PatternItem> mo136378r() throws RemoteException;

    /* renamed from: s */
    List<LatLng> mo136379s() throws RemoteException;

    /* renamed from: t */
    Cap mo136380t() throws RemoteException;

    /* renamed from: t3 */
    void mo136381t3(float f) throws RemoteException;

    /* renamed from: t4 */
    void mo136382t4(List<LatLng> list) throws RemoteException;

    /* renamed from: u */
    void mo136383u() throws RemoteException;

    /* renamed from: w */
    boolean mo136384w() throws RemoteException;

    /* renamed from: x */
    boolean mo136385x() throws RemoteException;

    /* renamed from: y */
    boolean mo136386y() throws RemoteException;

    /* renamed from: y7 */
    void mo136387y7(Cap cap) throws RemoteException;
}
