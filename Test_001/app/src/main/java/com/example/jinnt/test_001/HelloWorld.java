import android.app.activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class EditTextSampleActivity extends Activity {
    @Override
    public void onCreawte(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        EditText editText = (EditText) findViewById(id.editText);
        // エディットテキストのテキストを設定します
        editText.setText("テスト");
        // エディットテキストのテキストを全選択します
        editText.selectAll();
        // エディットテキストのテキストを取得します
        String text = editText.getText().toString();
        Toast.makeText(th9s, text, Toast.LENGTH_LONG);
    }
}