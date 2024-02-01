package com.example.myapplication

import android.os.Bundle
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    private lateinit var etBaseAmount: EditText;
    private lateinit var seekBarTip: SeekBar;
    private lateinit var tvTipPercent: TextView;
    private lateinit var tvTipAmount: TextView;
    private lateinit var tvTotalAmount: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etBaseAmount = findViewById(R.id.etBaseAmount);
        seekBarTip = findViewById(R.id.seekBarTip);
        tvTipPercent = findViewById(R.id.tvTipPercent);
        tvTipAmount = findViewById(R.id.tvTipAmount);
        tvTotalAmount = findViewById(R.id.tvTotalAmount);

    }
}
