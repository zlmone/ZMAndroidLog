package com.zm.zmandroidlog.customview.CircleMenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.zm.utilslib.view.CircleMenuViewGroup.CircleMenuLayout;
import com.zm.zmandroidlog.R;

public class CircleActivity extends Activity {

	private CircleMenuLayout mCircleMenuLayout;

	private String[] mItemTexts = new String[]{"安全中心 ", "特色服务", "投资理财",
			"转账汇款", "我的账户", "信用卡"};
	private int[] mItemImgs = new int[]{R.drawable.home_mbank_1_normal,
			R.drawable.home_mbank_2_normal, R.drawable.home_mbank_3_normal,
			R.drawable.home_mbank_4_normal, R.drawable.home_mbank_5_normal,
			R.drawable.home_mbank_6_normal};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		//自已切换布局文件看效果
		setContentView(R.layout.activity_circle);

		mCircleMenuLayout = (CircleMenuLayout) findViewById(R.id.id_menulayout);
		mCircleMenuLayout.setMenuItemIconsAndTexts(mItemImgs, mItemTexts);


		mCircleMenuLayout.setOnMenuItemClickListener(new CircleMenuLayout.OnMenuItemClickListener() {

			@Override
			public void itemClick(View view, int pos) {
				Toast.makeText(CircleActivity.this, mItemTexts[pos],
						Toast.LENGTH_SHORT).show();

			}

			@Override
			public void itemCenterClick(View view) {
				Toast.makeText(CircleActivity.this,
						"you can do something just like ccb  ",
						Toast.LENGTH_SHORT).show();

			}
		});

	}
}
