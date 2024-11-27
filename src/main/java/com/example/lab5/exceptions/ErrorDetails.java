package com.example.lab5.exceptions;

import java.util.Date;

public record ErrorDetails(Date timestamp, String message, String details) {
}
