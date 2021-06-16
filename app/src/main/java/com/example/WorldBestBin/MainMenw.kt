package com.example.WorldBestBin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main_menw.*
import net.daum.mf.map.api.MapPOIItem
import net.daum.mf.map.api.MapPoint
import net.daum.mf.map.api.MapView

class MainMenw : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menw)

        val map = MapView(this)
        mapView.addView(map)

        val marker = MapPOIItem()
        marker.itemName = "Superbin"
        marker.tag = 1
        marker.mapPoint = MapPoint.mapPointWithGeoCoord(37.3751456750031, 126.63292359652542)
        marker.markerType = MapPOIItem.MarkerType.CustomImage
//        marker.selectedMarkerType = MapPOIItem.MarkerType.RedPin // 마커를 클릭했을때, 기본으로 제공하는 RedPin 마커 모양.
        marker.customImageResourceId = R.drawable.waste_marker_60
//        marker.setCustomImageResourceId(R.drawable.waste); // 마커 이미지.
//        marker.setCustomImageAutoscale(false); // hdpi, xhdpi 등 안드로이드 플랫폼의 스케일을 사용할 경우 지도 라이브러리의 스케일 기능을 꺼줌.
        marker.isCustomImageAutoscale = false
        marker.setCustomImageAnchor(0.5f, 1.0f); // 마커 이미지중 기준이 되는 위치(앵커포인트) 지정 - 마커 이미지 좌측 상단 기준 x(0.0f ~ 1.0f), y(0.0f ~ 1.0f) 값.
        map.addPOIItem(marker)


    }
}