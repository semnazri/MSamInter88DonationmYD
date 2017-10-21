package mdcreative.com.interdonation.Fragment;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;

import mdcreative.com.interdonation.MainActivity;
import mdcreative.com.interdonation.R;

/**
 * Created by Semmy on 10/21/2017.
 */

public class Fragment_login extends Fragment {
    private View view;
    private Button btn_login, btn_signup;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_login, container, false);
        btn_login = (Button) view.findViewById(R.id.btn_login);
        btn_signup = (Button) view.findViewById(R.id.btn_register);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(getActivity());
                dialog.setContentView(R.layout.layoutdialog);
                dialog.setTitle("Waktu Pengiriman");

                Button btn_proced = (Button) dialog.findViewById(R.id.btn_ok);
                btn_proced.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(getActivity(), MainActivity.class);
                        startActivity(i);
                    }
                });
                dialog.show();

            }
        });
        return view;
    }
}
