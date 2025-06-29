<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>

    <!-- Bootstrap 5 CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom Styles -->
    <style>
        body {
            background: linear-gradient(to right, #e52d27, #b31217); /* Red Gradient */
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            font-family: 'Segoe UI', sans-serif;
        }

        .card {
            border-radius: 20px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.3);
        }

        .form-label {
            font-weight: 600;
        }

        .btn-login {
            background-color: #b31217;
            color: white;
        }

        .btn-login:hover {
            background-color: #a10f13;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-5">
            <div class="card p-4 bg-white">
                <h2 class="text-center mb-4 text-danger">Login</h2>
                <form action="Saveauthor" method="post">
                    <div class="mb-3">
                        <label for="username" class="form-label">Username</label>
                        <input type="text" class="form-control" id="username" name="username" required>
                    </div>
                    <div class="mb-3">
                        <label for="password" class="form-label">Password</label>
                        <input type="password" class="form-control" id="password" name="password" required>
                    </div>
                    <div class="d-grid">
                        <button type="submit" class="btn btn-login">Login</button>
                    </div	>
                </form>
                <p class="text-center mt-3 mb-0">Don't have an account? <a href="registration" class="text-danger">Register</a></p>
            </div>
        </div>
    </div>
</div>

</body>
</html>
