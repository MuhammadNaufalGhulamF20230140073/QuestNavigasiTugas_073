package com.example.navigasilayout.view


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.navigasilayout.R
import com.example.navigasilayout.ui.theme.LightBlue
import com.example.navigasilayout.ui.theme.Purple40
import com.example.navigasilayout.ui.theme.Purple80

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Formulir(
    OnSubmitButtonClick: () -> Unit,
    modifier: Modifier = Modifier) {
    val dummyTextValue = remember { mutableStateOf("") }
    val dummyOnValueChange: (String) -> Unit = {}

    val selectedGender = ""
    val selectedStatus = ""

    val genderOptions = listOf("Laki-laki", "Perempuan")
    val statusOptions = listOf("Janda", "Lajang", "Duda")
