package mdcreative.com.interdonation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

/**
 * Created by Semmy
 * mr.shanky08@gmail.com on 1/13/17.
 *
 * @copyright 2016
 * PT.Bisnis Indonesia Sibertama
 */

public class SplashScreen extends Activity {
//    private ConnectionDetector cd;
//    private Boolean isInternetPresent = false;
//    private ProgressDialog pDialog;
//    private SweetAlertDialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activuty_splash);
//        cd = new ConnectionDetector(this);
        Thread timerThread = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {

//                    version();
                    Intent intent = new Intent(SplashScreen.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        timerThread.start();
    }

//    private void version() {
//        isInternetPresent = cd.isConnectingToInternet();
//        if (isInternetPresent) {
//            getVersion();
//
//        }else if (isInternetPresent.equals(false)) {
//            getDialog("Oops! Something Went Wrong.\nPlease Check your connection!").show();
//
//        }
//    }

//    private void getVersion() {
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(APIConstant.BASE_API)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        final VersionInterface service = retrofit.create(VersionInterface.class);
//        Call<VersionControl> call = service.getlastVersion();
//        call.enqueue(new Callback<VersionControl>() {
//            @Override
//            public void onResponse(Call<VersionControl> call, Response<VersionControl> response) {
//                String version = response.body().getVersion();
//
//                String versionName = "";
////                    int versionCode = -1;
//                try {
//                    PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
//                    versionName = packageInfo.versionName;
//
////                        versionCode = packageInfo.versionCode;
//                } catch (PackageManager.NameNotFoundException e) {
//                    e.printStackTrace();
//                }
//
//                Log.d("version__", versionName);
//                Log.d("versi server", version);
//
//                if (version.equals(versionName)) {
//                    Intent intent = new Intent(SplashScreen.this, LoginActivity.class);
//                    startActivity(intent);
//                    finish();
//                }else{
//                    updateDialog("The latest version is available in playstore, please download the latest version for your convenience")
//                    .setConfirmText("Update")
//                    .setCancelText("Later")
//                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
//                        @Override
//                        public void onClick(SweetAlertDialog sweetAlertDialog) {
//                            try {
//                                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=bisnisindoneisa.epaper")));
//                            } catch (android.content.ActivityNotFoundException anfe) {
//                                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=bisnisindoneisa.epaper&hl=in")));
//                            }
//                        }
//                    })
//                    .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
//                        @Override
//                        public void onClick(SweetAlertDialog sweetAlertDialog) {
//                            Intent intent = new Intent(SplashScreen.this, LoginActivity.class);
//                            startActivity(intent);
//                            finish();
//                        }
//                    })
//                    .show();
//                }
//
//            }
//
//            @Override
//            public void onFailure(Call<VersionControl> call, Throwable t) {
//                Log.d("onFailure", t.toString());
//                getDialog("Oops! Something Went Wrong.\nPlease Check your connection!").show();
//            }
//        });
//
//    }

//    private SweetAlertDialog getDialog(String s) {
//        mDialog = new SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE);
//        mDialog.setTitleText("E-Paper");
//        mDialog.setContentText(s);
//        mDialog.setConfirmText("Close");
//        mDialog.changeAlertType(SweetAlertDialog.NORMAL_TYPE);
//
//        return mDialog;
//    }
//
//    private SweetAlertDialog updateDialog(String s) {
//        mDialog = new SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE);
//        mDialog.setTitleText("E-Paper");
//        mDialog.setContentText(s);
//        mDialog.changeAlertType(SweetAlertDialog.WARNING_TYPE);
//
//        return mDialog;
//    }

}
