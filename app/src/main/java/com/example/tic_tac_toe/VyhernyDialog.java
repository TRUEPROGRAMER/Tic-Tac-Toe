package com.example.tic_tac_toe;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;

public class VyhernyDialog extends Dialog {

    private final String message;
    private final HraciaPlocha hraciaPlocha;

    public VyhernyDialog(@NonNull Context context, String message, HraciaPlocha hraciaPlocha) {
        super(context);
        this.message = message;
        this.hraciaPlocha = hraciaPlocha;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.vyherny_dialog_layout);

        final TextView message_text = findViewById(R.id.message_text);
        final TextView start_again_button = findViewById(R.id.start_again_button);

        message_text.setText(message);

        start_again_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hraciaPlocha.restartKola();
                dismiss();
            }
        });
    }
}
